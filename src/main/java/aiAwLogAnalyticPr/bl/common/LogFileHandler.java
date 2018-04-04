package aiAwLogAnalyticPr.bl.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

import aiAwLogAnalyticPr.bl.Contributor;

public class LogFileHandler {
	private String filePath;
	public static boolean turnOn;

	public LogFileHandler(String filePath) {
		super();
		this.filePath = filePath;
	}

	private Vector<String> getLines() throws IOException {
		File f = new File(filePath);
		ReverseLineInputStream rlis = new ReverseLineInputStream(f);
		InputStreamReader isr = new InputStreamReader(rlis);

		BufferedReader reader = new BufferedReader(isr);
		String line = null;
		Vector<String> lines = new Vector<String>();
		String ls = System.getProperty("line.separator");
		try {
			while ((line = reader.readLine()) != null) {
				lines.add(line + ls);
			}
			return lines;
		} finally {
			reader.close();
		}

	}

	public void printLines(int... args) {
		Vector<String> lines = null;
		try {
			lines = this.getLines();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Iterator<String> iter = lines.iterator();
		while (iter.hasNext()) {
			String line = iter.next();
			if (args.length > 0) {
				int n = args[0];
				Contributor contr = new Contributor();
				String dateStr = contr.getDateSubstr(line);
				// 10/Oct/2017:13:54:00 +0000
				// dd/MMM/yyyy:HH:mm:ss Z
				String datePattern = "dd/MMM/yyyy:HH:mm:ss Z";
				SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
				Date lineDate = null;
				try {
					lineDate = sdf.parse(dateStr);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Date endIeNow = new Date();
				Date startIeNMinutesAgo = contr.getDateNMinutesBefore(n, endIeNow);
				if (turnOn && contr.isWithin(lineDate, startIeNMinutesAgo, endIeNow)) {
					System.out.println(line);
				} else {
					if (turnOn) {
						turnOn = false;
					}
				}
			} else {
				System.out.println(line);
			}
		}
	}

	public void printLinesFromThePastNMinutes(int n) {
		printLines(n);
	}
}
