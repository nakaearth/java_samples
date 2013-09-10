package date_sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDateMain {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		System.out.println(format.format(date));
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day   = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Date:" + year + "-" + month + "-" + day);
		System.out.println(calendar.get(Calendar.YEAR)); 
		System.out.println(calendar.get(Calendar.MONTH)); // 0->11
		System.out.println(calendar.get(Calendar.DATE)); 
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2013, 7, 20);
		if (calendar.before(calendar2)) System.out.println("8月20日は今日よりも前です");
		if (calendar.after(calendar2))  System.out.println("8月20日は今日よりも後です");
		// 2つの日付の差を求める(ミリ秒)
		System.out.println("今日と8月20日の差は・・・約" + (calendar.getTime().getTime() - calendar2.getTime().getTime())/(1000 * 60* 60 * 24) + "日");
	}
}
