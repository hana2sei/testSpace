package work;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("こんにちは");
		System.out.println("こんばんは");
		
		System.out.println("おはよう！");

		int input = new java.util.Scanner(System.in).nextInt();
		if (input == 1) {
			System.out.println("1を入力しましたね");
		} else if(input == 3) {
			System.out.println("3もいいですね！");
		} else {
			System.out.println("1,3以外を入力しましたね");
		}

		System.out.println("処理を終了します");
	}

}
