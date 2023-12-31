package work;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("こんにちは。今日はいい天気ですね！");
		System.out.println("こんばんは。今宵は冷えますね");

		int input = new java.util.Scanner(System.in).nextInt();
		if (input == 1) {
			System.out.println("1を入力しましたね");
		} else if(input == 4) {
			System.out.println("4もいいですね！");
		} else {
			System.out.println("1,4以外を入力しましたね");
		}

		System.out.println("処理を終了します");
	}

}
