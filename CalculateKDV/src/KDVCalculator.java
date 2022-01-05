import java.util.Scanner;

public class KDVCalculator {

	public static void main(String[] args) {
		// KDV Tutarý Hesaplayan Program
		
		double fiyat, kdvFiyat;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("KDV'si Hesaplanacak Tutarý Giriniz : ");
		fiyat = scan.nextDouble();
		
		kdvFiyat = (fiyat > 1000) ? (fiyat * 0.08) : (fiyat * 0.18);
		
		System.out.println("KDV'siz Fiyat : "+fiyat);
		System.out.println("KDV'li Fiyat : "+(fiyat + kdvFiyat));
		System.out.println("KDV : "+kdvFiyat);

	}

}
