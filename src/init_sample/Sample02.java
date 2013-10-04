package init_sample;

public class Sample02 {

	public static void main(String[] args) {
		System.out.println("test hello");
		if (args.length != 2) {
			System.err.println("error: 引数は2つです ");
			System.exit(-1);
		} else if (args.length == 2) {
			System.out.println("引数の数はあっています！");
		}
		System.out.println(args[0] + "," + args[1]);
	}
}
