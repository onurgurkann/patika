import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Vücut Kitle Ýndeks Hesaplama
		
		double boy, kilo;
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
		boy = scan.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo = scan.nextDouble();
		System.out.print("Vücut Kitle Ýndeksiniz : "+(kilo / (boy * boy)));
		
	}

}
