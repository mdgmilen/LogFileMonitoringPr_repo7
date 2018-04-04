package aiAwLogAnalyticPr.bl;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contributor {

	public String getDateSubstr(String line) {
		// regexPattern \[[A-Za-z0-9/: +]*\]
		// finds [10/Oct/2017:13:54:00 +0000]
		// from 127.0.0.1 user-identifier frank [10/Oct/2017:13:54:00 +0000]
		// "GET /api/endpoint HTTP/1.0" 200 5134
		// https://regexr.com/

		String regexPattern = "\\[[A-Za-z0-9/: +]*\\]";
		// get first match
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(line);
		m.find();
		String matchedValueTwoMore = line.substring(m.start(), m.end());
		String matchedValue = matchedValueTwoMore.substring(1, matchedValueTwoMore.length() - 1);
		return matchedValue;
	}

	public Date getDateNMinutesBefore(int nMinutes, Date date) {
		Calendar newDateCalendar = Calendar.getInstance();
		newDateCalendar.setTimeInMillis(date.getTime());
		newDateCalendar.add(Calendar.MINUTE, -nMinutes);

		return newDateCalendar.getTime();
	}

	public boolean isWithin(Date date, Date start, Date end) {
		boolean isWithin = start.compareTo(date) * date.compareTo(end) > 0;
//		if (isWithin) {
//			System.out
//					.println(String.format("%s is between %s, %s", date.toString(), start.toString(), end.toString()));
//		} else {
//			System.out.println(
//					String.format("%s is not between %s, %s", date.toString(), start.toString(), end.toString()));
//		}
		return isWithin;
	}

	public int getNumberPart(String text) { 
	    // "/http-01.log";
		// -[0-9]*   -->  -01
		String regexPattern = "-[0-9]*";
		// get first match
		Pattern p = Pattern.compile(regexPattern);
		Matcher m = p.matcher(text);
		m.find();
		String matchedValueTwoMore = text.substring(m.start(), m.end());
		String matchedValue = matchedValueTwoMore.substring(1, matchedValueTwoMore.length() );
		int matchedValueInt = Integer.parseInt(matchedValue);
		return matchedValueInt;
	}
}
