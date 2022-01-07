import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double number;
		double harmonic = 0.0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Harmonik Hesaplanacak Sayýyý Girin : ");
		number = scan.nextDouble();
		
		while(number > 0) {
			harmonic += (1/number);
			number--;
		}
		/* -- For
		for(double i = 1; i <= number; i++) {
			harmonic += (1/i);
		}
		*/
		System.out.println("Harmonik Sonucu : "+harmonic);

	}

}
