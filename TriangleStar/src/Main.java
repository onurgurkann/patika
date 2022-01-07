import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Number : ");
		int number = scan.nextInt();
		
		for(int i = number-1; i >= 0; i--) {
			for(int j = 0; j < (number-i); j++) {
				System.out.print(" ");
			}
			for(int k = 2 * i + 1; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
