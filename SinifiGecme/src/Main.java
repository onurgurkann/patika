import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int mat, fiz, tur, kim, muz, sum = 0, count = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Notlarý Girin");
		System.out.print("Matematik Notu : ");
		mat = scan.nextInt();
		if (mat >= 0 && mat <= 100) {
			sum += mat;
			count++;
		}
		System.out.print("Fizik Notu : ");
		fiz = scan.nextInt();
		if (fiz >= 0 && fiz <= 100) {
			sum += fiz;
			count++;
		}
		System.out.print("Türkçe Notu : ");
		tur = scan.nextInt();
		if (tur >= 0 && tur <= 100) {
			sum += tur;
			count++;
		}
		System.out.print("Kimya Notu : ");
		kim = scan.nextInt();
		if (kim >= 0 && kim <= 100) {
			sum += kim;
			count++;
		}
		System.out.print("Müzik Notu : ");
		muz = scan.nextInt();
		if (muz >= 0 && muz <= 100) {
			sum += muz;
			count++;
		}

		System.out.println("Ortalama : " + (sum / count) + ((sum / count) >= 55 ? " - Sýnýfý Geçti" : " - Sýnýfta Kaldý"));
	}

}
