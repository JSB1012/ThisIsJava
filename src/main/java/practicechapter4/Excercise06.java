package practicechapter4;

public class Excercise06 {

	public static void main(String[] args) {
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
				if (y == x) {
					System.out.println();
				}
			}
		}

	}

}
