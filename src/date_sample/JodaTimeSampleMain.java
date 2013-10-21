package date_sample;

import org.joda.time.DateTime;

public class JodaTimeSampleMain {
	public static void main(String[] args) {
		DateTime dt = new DateTime();
		System.out.println(dt);
		System.out.println("フォーマットを変える:" + dt.toString("yyyy/MM/dd"));
		System.out.println("年:" + dt.getYear());
		System.out.println("月:" + dt.getMonthOfYear());
		System.out.println("日:" + dt.getDayOfMonth());
		System.out.println("時:" + dt.getHourOfDay());
		System.out.println("分:" + dt.getMinuteOfHour());
		System.out.println("10日後:" + dt.plusDays(10));
		System.out.println("1週間後:" + dt.plusWeeks(1));
	}
}
