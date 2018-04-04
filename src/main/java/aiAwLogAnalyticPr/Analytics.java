package aiAwLogAnalyticPr;

import java.io.File;
import java.util.ArrayList;

//import aiAwLogAnalyticPr.bl.Contributor;
import aiAwLogAnalyticPr.bl.common.LogFileHandler;

/*
 * 
 * This is the main class of the current CLI /command-line-interface java application
 * 
 * 
 * Sample usage:
 *   analytics -t <mins>m -d <dir>
 *   
 *   cd /home/front/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr
 *   ./analytics.sh -t 10m -d cLog/
 *   java -jar analytics.jar -t 10m -d cLog/
 * 
 * 
 * */

public class Analytics {

	public static void main(String[] args) {
		String minutesParamStr = args[1];  //"160m";
		int minutesCount = Integer.parseInt(minutesParamStr.substring(0, minutesParamStr.length()-1));
		String dir = args[3];
		
		System.out.println("start------------");
		// loop through the log files in the pointed directory /folder
		loopThroughFiles(dir, minutesCount);
		System.out.println("end--------------");
	}

	// ui up, bw bl, da sa, be, db

	// +TODO make the command /shell-script    analytics -t <mins>m -d <dir>
	// x    WAITING /NYI    shell-script to accept -t and -d in any order   
	// +TODO to work with 2+ log files
	// + start with the newest file, i.e. from http-09.log to http-08.log ...
	// -Write unit / functional tests for the app
	// x TODO handle some more erroneous situations
	
	
	
	public static void loopThroughFiles(String directory, int minutesCount) {
		File dir = new File(directory);
		String[] filesList = dir.list();
		ArrayList<String> names = new ArrayList<String>();
		for (String file : filesList) {
				names.add(file);
		}
		LogFileHandler.turnOn = true;
		for (int i=names.size()-1; i >= 0; i--) {
			printFile(directory, minutesCount, names.get(i));
		}
	}
	
	public static void printFile(String directory, int minutesCount, String fileName) {
		String logFilePath = directory + fileName;
		LogFileHandler file = new LogFileHandler(logFilePath);
		file.printLinesFromThePastNMinutes(minutesCount);
	}
}
