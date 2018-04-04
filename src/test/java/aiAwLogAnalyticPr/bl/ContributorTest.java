package aiAwLogAnalyticPr.bl;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class ContributorTest {

	@Test
	public void testGetDateSubstr() {
		Contributor contr = new Contributor();
		String line = "127.0.0.1 user-identifier frank [10/Oct/2017:13:54:00 +0000] \"GET /api/endpoint HTTP/1.0\" 200 5134";
		String result = "10/Oct/2017:13:54:00 +0000";
		assertEquals(result, contr.getDateSubstr(line));
	}

	@Test
	public void testGetDateNMinutesBefore() {
		Contributor contr = new Contributor();
		Date param = new Date();

		int nMinutes = 60;
		Date dateForResult = new Date();

		Calendar newDateCalendar = Calendar.getInstance();
		newDateCalendar.setTimeInMillis(dateForResult.getTime());
		newDateCalendar.add(Calendar.MINUTE, -nMinutes);
		Date result = newDateCalendar.getTime();

		assertEquals(result, contr.getDateNMinutesBefore(nMinutes, param));
	}

	@Test
	public void testIsWithin() {
		Contributor contr = new Contributor();
		Date end = new Date();

		Calendar newDateCalendar = Calendar.getInstance();
		newDateCalendar.setTimeInMillis(end.getTime());
		newDateCalendar.add(Calendar.MINUTE, -60);
		Date start = newDateCalendar.getTime();

		newDateCalendar.setTimeInMillis(end.getTime());
		newDateCalendar.add(Calendar.MINUTE, -30);
		Date in = newDateCalendar.getTime();
		assertEquals(true, contr.isWithin(in, start, end));

		newDateCalendar.setTimeInMillis(end.getTime());
		newDateCalendar.add(Calendar.MINUTE, -90);
		Date out = newDateCalendar.getTime();
		assertEquals(false, contr.isWithin(out, start, end));
	}

	@Test
	public void testGetNumberPart() {
		// "";
		// -[0-9]*   -->  -01}
		Contributor contr = new Contributor();
		assertEquals(1, contr.getNumberPart("/http-01.log"));
		assertEquals(2, contr.getNumberPart("/http-02.log"));
	}
	
}
