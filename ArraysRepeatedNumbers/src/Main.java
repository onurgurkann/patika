import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 5, 6, 7, 6, 3, 4, 4, 1, 9, 9, 10, -2, -1, -2, -5, 90, 45 };
			
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if((i != j) && (arr[i] == arr[j]) && arr[i] % 2 == 0) {
					System.out.print(arr[i]+", ");
					break;
				}
			}
		}
	}

}
