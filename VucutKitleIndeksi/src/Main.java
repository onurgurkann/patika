import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// V�cut Kitle �ndeks Hesaplama
		
		double boy, kilo;
		Scanner scan = new Scanner(System.in);
		System.out.print("L�tfen boyunuzu (metre cinsinden) giriniz : ");
		boy = scan.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz : ");
		kilo = scan.nextDouble();
		System.out.print("V�cut Kitle �ndeksiniz : "+(kilo / (boy * boy)));
		
	}

}
