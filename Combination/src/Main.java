import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// C(n,r) = n! / (r!*(n-r)!)
		
		int n, r, nr, sumN = 1, sumR = 1, sumNR = 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("K�menin Eleman Say�s� : ");
		n = scan.nextInt();
		System.out.print("Olu�turulacak Alt K�me Eleman Say�s� : ");
		r = scan.nextInt();
		nr = n-r;
		
		for(int i = 1; i <= n; i++) {
			sumN *= i;
		}
		for(int i = 1; i <= r; i++) {
			sumR *= i;
		}
		for(int i = 1; i <= nr; i++) {
			sumNR *= i;
		}
		
		System.out.println("Kombinasyon Sonucu : "+(sumN / (sumR*sumNR)));
		
		// metot ile hesaplama
		//System.out.println("Sonu� : "+(factorial(n)/(factorial(r)*factorial(n-r))));
	}
	/* -- metot ile hesaplama
	public static int factorial (int f) {
		int sum = 1;
		for(int i = 1; i <= f; i++) {
			sum *= i;
		}
		return sum;
	}
	*/
}
