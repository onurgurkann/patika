import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int number = scan.nextInt();
		
		int[] arr = new int[number];
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+". element : ");
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int item : arr) {
			System.out.print(item+" ");
		}

	}

}
