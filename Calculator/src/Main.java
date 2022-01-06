import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Hesap Makinesi

		int number1, number2, select;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ýlk sayýyý girin : ");
		number1 = scan.nextInt();
		System.out.print("Ýkinci sayýyý girin : ");
		number2 = scan.nextInt();
		System.out.println("\n1- Toplama\n2- Çýkarma\n3- Çarpma\n4- Bölme");
		System.out.print("Ýþlem Seçin (1-2-3-4) : ");
		select = scan.nextInt();

		switch (select) {
		case 1:
			System.out.println("Toplam : " + (number1 + number2));
			break;
		case 2:
			System.out.println("Fark : " + (number1 - number2));
			break;
		case 3:
			System.out.println("Çarpým : " + (number1 * number2));
			break;
		case 4:
			if(number2 == 0) {
				System.out.println("Bölme sonucu tanýmsýz.");
			}
			else {
				System.out.println("Bölüm : " + (number1 / number2));
			}
			break;
		default:
			System.out.println("Lütfen geçerli bir iþlem seçiniz!");
			break;
		}

	}

}
