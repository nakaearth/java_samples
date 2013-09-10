package date_sample;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

public class TestJodaTime {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		// 時間
		LocalTime time = LocalTime.now();
		System.out.println(time);
		// 日時
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);		
		// 現在の日時
		System.out.println(LocalDateTime.now());

		// 文字列を指定。秒未満は省略可
		System.out.println(LocalDateTime.parse("2012-02-03T21:30:15.123"));
	}
}
