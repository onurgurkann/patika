import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Manav Kasa Toplam Fiyat Hesaplama

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Meyveler ve KG Fiyatlarý");
		System.out.print("• Armut : 2,14 TL\n• Elma : 3,67 TL\n• Domates : 1,11 TL"
				+ "\n• Muz : 0,95 TL\n• Patlýcan : 5,00 TL\n\n");

		System.out.print("Armut Kaç Kilo ? :");
		armut *= scan.nextDouble();
		System.out.print("Elma Kaç Kilo ? :");
		elma *= scan.nextDouble();
		System.out.print("Domates Kaç Kilo ? :");
		domates *= scan.nextDouble();
		System.out.print("Muz Kaç Kilo ? :");
		muz *= scan.nextDouble();
		System.out.print("Patlýcan Kaç Kilo ? :");
		patlican *= scan.nextDouble();

		System.out.println("Toplam Tutar : " + (armut + elma + domates + muz + patlican)+" TL");

	}

}
