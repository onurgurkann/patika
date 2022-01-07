import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int input, number1 = 0, number2 = 1, sum;
		Scanner scan = new Scanner(System.in);
		System.out.print("Number : ");
		input = scan.nextInt();
		
		System.out.print("Fibonacci : ");
		for(int i = 0; i < input; i++) {
			System.out.print(number1+" ");
			sum = number1 + number2;
			number1 = number2;
			number2 = sum;
		}
	}
}