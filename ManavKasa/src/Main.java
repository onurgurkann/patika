import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Manav Kasa Toplam Fiyat Hesaplama

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Meyveler ve KG Fiyatlar�");
		System.out.print("� Armut : 2,14 TL\n� Elma : 3,67 TL\n� Domates : 1,11 TL"
				+ "\n� Muz : 0,95 TL\n� Patl�can : 5,00 TL\n\n");

		System.out.print("Armut Ka� Kilo ? :");
		armut *= scan.nextDouble();
		System.out.print("Elma Ka� Kilo ? :");
		elma *= scan.nextDouble();
		System.out.print("Domates Ka� Kilo ? :");
		domates *= scan.nextDouble();
		System.out.print("Muz Ka� Kilo ? :");
		muz *= scan.nextDouble();
		System.out.print("Patl�can Ka� Kilo ? :");
		patlican *= scan.nextDouble();

		System.out.println("Toplam Tutar : " + (armut + elma + domates + muz + patlican)+" TL");

	}

}
