import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] arr = { 15, 12, 788, 1, -1, -778, 2, 0 };
		int number, min = 0, max = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number : ");
		number = scan.nextInt();
		min = number;
		max = number;
		Arrays.sort(arr);
		
		for(int item : arr) {
			System.out.print(item+",");
		}

		for (int i = 0; i < arr.length; i++) {
			if (number < arr[i]) {
				min = arr[i-1];
				max = arr[i];
				break;
			}
		}
		System.out.println();
		System.out.println("Min Value : "+min+" - Max Value : "+max);
	}

}
