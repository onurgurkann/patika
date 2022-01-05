import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int matNot, fizNot, kimNot, turNot, tarNot, muzNot;
		double ort;

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Notlarý Sýrasýyla Girin");
		System.out.print("Matematik Notu : ");
		matNot = scan.nextInt();
		System.out.print("Fizik Notu : ");
		fizNot = scan.nextInt();
		System.out.print("Kimya Notu : ");
		kimNot = scan.nextInt();
		System.out.print("Türkçe Notu : ");
		turNot = scan.nextInt();
		System.out.print("Tarih Notu : ");
		tarNot = scan.nextInt();
		System.out.print("Müzik Notu : ");
		muzNot = scan.nextInt();

		ort = (matNot + fizNot + kimNot + turNot + tarNot + muzNot) / 6;
		System.out.print("Ortalama : "+ort+" - ");
		System.out.print(ort >= 60 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý");

	}

}
