package work;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("こんにちは");
		System.out.println("こんばんは");
		
		int input = new java.util.Scanner(System.in).nextInt();
		if (input == 1) {
			System.out.println("1を入力しましたね");
		} else {
			System.out.println("1以外を入力しましたね");
		}
	}

}
