package jan_18;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
//		int day2 = now.get(Calendar.DAY_OF_WEEK);

		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.println(day + "��");
//		System.out.println(day2);

		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if (ampm == Calendar.AM) {
			strampm = "����";
		} else {
			strampm = "����";
		}
		System.out.print(strampm + " ");
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(hour + "��");
		System.out.print(minute + "��");
		System.out.println(second + "��");
	}

}
