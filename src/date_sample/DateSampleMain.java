package date_sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSampleMain {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		SimpleDateFormat format2 = new SimpleDateFormat("YYYY/MM/dd");
		System.out.println("日付:" + format.format(date));
		System.out.println("フォーマットを変える:" + format2.format(date));
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("年:" + calendar.get(Calendar.YEAR)); 
		System.out.println("月:" + (calendar.get(Calendar.MONTH) + 1)); // 0->11
		System.out.println("日:" + calendar.get(Calendar.DATE)); 
		System.out.println("時:" +calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分:" + calendar.get(Calendar.MINUTE));
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2013, 7, 20);
		if (calendar.before(calendar2)) System.out.println("8月20日は今日よりも前です");
		if (calendar.after(calendar2))  System.out.println("8月20日は今日よりも後です");
		// 2つの日付の差を求める(ミリ秒)
		System.out.println("今日と8月20日の差は・・・約" + (calendar.getTime().getTime() - calendar2.getTime().getTime())/(1000 * 60* 60 * 24) + "日");
	}
}
