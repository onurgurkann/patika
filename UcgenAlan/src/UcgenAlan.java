import java.util.Scanner;

public class UcgenAlan {

	public static void main(String[] args) {
		// Üç kenar uzunluðu bilinen üçgenin alanýný hesaplayan program
		
		int kenar1, kenar2, kenar3;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Üçgenin ilk kenarýný girin : ");
		kenar1 = scan.nextInt();
		System.out.print("Üçgenin ikinci kenarýný girin : ");
		kenar2 = scan.nextInt();
		System.out.print("Üçgenin üçüncü kenarýný girin : ");
		kenar3 = scan.nextInt();
		
		double u = (kenar1 + kenar2 + kenar3) / 2;
		System.out.println("Üçgenin Alaný : "+Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)));

	}

}
