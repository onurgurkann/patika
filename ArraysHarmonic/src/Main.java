
public class Main {

	public static void main(String[] args) {

		int[] arr = { 4, 1, 5, 2, 3 };
		double sum = 0.0;

		for (int i = 0; i < arr.length; i++) {
			for (double j = arr[i]; j > 0; j--) {
				sum += (1.0 / j);
			}
		}
		System.out.println("Average: " + sum / arr.length);
	}

}
