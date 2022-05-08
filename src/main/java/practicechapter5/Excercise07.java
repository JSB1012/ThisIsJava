package practicechapter5;

public class Excercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int array1 : array) {
			if (max < array1) {
				max = array1;
			}
		}

		System.out.println("max: " + max);

	}

}
