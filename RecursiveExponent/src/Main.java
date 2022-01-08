import java.util.Scanner;

public class Main {

	static double exponent(double base, double exponent) {
		if (exponent == 0) {
			return 1;
		}
		return base * (exponent(base, exponent - 1));
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double base, exponent;
		double result = 0.0;
		System.out.print("Base : ");
		base = scan.nextInt();
		System.out.print("Exponent : ");
		exponent = scan.nextInt();
		
		if (exponent < 0) {
			// if exponent value is negative
			result = (1 / (exponent(base, (exponent) * -1))); // exponent -> negative value to positive value
			System.out.println("Result : " + result);
		} else {
			System.out.println("Result : " + (int) exponent(base, exponent));
		}
	}

}
