package work;

public class Test {

	public static void main(String[] args) {
		int key = 10;
		switch (key) {
			case 1, 2 -> {
				System.out.println("1st");
			}
			case 3 -> {
				System.out.println("2nd");
			}
			default -> {
				System.out.println("3rd");
			}
		}
	}

}
