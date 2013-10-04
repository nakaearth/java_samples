package init_sample;

public class Sample03 {

	public static void main(String[] args) {
		System.out.println("test hello");
		if (args.length < 2) {
			System.err.println("error: 引数は2つ以上です ");
			System.exit(-1);
		} else if (args.length >= 2) {
			System.out.println("引数の数はあっています！");
		}
		for(String value: args) {
			System.out.println("引数:" + value);
		}
	}
}
