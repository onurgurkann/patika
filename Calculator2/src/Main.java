import java.util.Scanner;

public class Main {

	static void plus() {
		Scanner scan = new Scanner(System.in);
		int input, number, sum = 0;
		System.out.print("Kaç adet sayý gireceksiniz : ");
		input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i + ". sayý : ");
			number = scan.nextInt();
			sum += number;
		}
		System.out.println("Sonuç : " + sum + "\n");
	}

	static void minus() {
		Scanner scan = new Scanner(System.in);
		int input, number, result = 0;
		System.out.print("Kaç adet sayý gireceksiniz :");
		input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i + ". sayý : ");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
			}
			result -= number;
		}
		System.out.println("Sonuç : " + result + "\n");
	}

	static void times() {
		Scanner scan = new Scanner(System.in);
		int input, number, result = 1;
		System.out.print("Kaç adet sayý gireceksiniz : ");
		input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i + ". sayý : ");
			number = scan.nextInt();
			result *= number;
		}
		System.out.println("Sonuç : " + result + "\n");
	}

	static void devide() {
		Scanner scan = new Scanner(System.in);
		double number1, number2, result = 0.0;
		System.out.print("1. sayýyý girin : ");
		number1 = scan.nextInt();
		System.out.print("2. sayýyý girin : ");
		number2 = scan.nextInt();
		if (number2 == 0) {
			System.out.println("0'a bölüm tanýmsýzdýr.\n");
		} else {
			result = number1 / number2;
			System.out.println("Sonuç : " + result + "\n");
		}

	}

	static void power() {
		Scanner scan = new Scanner(System.in);
		int base, exponent, result = 1;
		System.out.print("Taban deðeri : ");
		base = scan.nextInt();
		System.out.print("Üs deðeri : ");
		exponent = scan.nextInt();

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		System.out.println("Sonuç : " + result + "\n");
	}

	static void factorial() {
		Scanner scan = new Scanner(System.in);
		int input, result = 1;
		System.out.print("Faktöriyeli alýnacak sayý : ");
		input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			result *= i;
		}
		System.out.println("Sonuç : " + result + "\n");
	}

	static void mod() {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.print("Modu alýnacak sayý : ");
		number1 = scan.nextInt();
		System.out.print("Alýnacak mod deðeri : ");
		number2 = scan.nextInt();
		System.out.println("Sonuç : " + (number1 % number2) + "\n");

	}

	static void rectangle() {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.print("Uzun kenarý girin : ");
		number1 = scan.nextInt();
		System.out.print("Kýsa kenarý girin : ");
		number2 = scan.nextInt();
		System.out.println("Dikdörtgenin Alaný : " + (number1 * number2) + " - Çevresi : " + (2 * (number1 + number2)) + "\n");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int select;
		do {
			System.out.println("1- Toplama\n2- Çýkarma\n3- Çarpma\n4- Bölme\n5- Üs Alma\n6- Faktöriyel Hesaplama\n"
					+ "7- Mod Alma\n8- Dikdörtgen Alan-Çevre Hesabý\n0- Çýkýþ\n");
			System.out.print("Bir iþlem seçin : ");
			select = scan.nextInt();

			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				devide();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mod();
				break;
			case 8:
				rectangle();
				break;
			case 0:
				break;
			default:
				System.out.println("Yanlýþ Ýþlem Seçimi!\n");
			}

		} while (select != 0);
	}

}
