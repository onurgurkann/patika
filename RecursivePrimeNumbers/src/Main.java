import java.util.Scanner;

public class Main {

	static boolean isPrime(int number, int i) {
		if (i >= number) {
			return true;
		}
		if (number % i == 0) {
			return false;
		} else
			return isPrime(number, i + 1);
	}

	public static void main(String[] args) {

		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		number = scan.nextInt();

		if (isPrime(number, 2)) {
			System.out.println(number + " is a prime");
		} else
			System.out.println(number + " is not a prime");

	}

}
