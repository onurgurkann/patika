import java.util.Scanner;

public class Main {

	static void plus() {
		Scanner scan = new Scanner(System.in);
		int input, number, sum = 0;
		System.out.print("Ka� adet say� gireceksiniz : ");
		input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i + ". say� : ");
			number = scan.nextInt();
			sum += number;
		}
		System.out.println("Sonu� : " + sum + "\n");
	}

	static void minus() {
		Scanner scan = new Scanner(System.in);
		int input, number, result = 0;
		System.out.print("Ka� adet say� gireceksiniz :");
		input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i + ". say� : ");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
			}
			result -= number;
		}
		System.out.println("Sonu� : " + result + "\n");
	}

	static void times() {
		Scanner scan = new Scanner(System.in);
		int input, number, result = 1;
		System.out.print("Ka� adet say� gireceksiniz : ");
		input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			System.out.print(i + ". say� : ");
			number = scan.nextInt();
			result *= number;
		}
		System.out.println("Sonu� : " + result + "\n");
	}

	static void devide() {
		Scanner scan = new Scanner(System.in);
		double number1, number2, result = 0.0;
		System.out.print("1. say�y� girin : ");
		number1 = scan.nextInt();
		System.out.print("2. say�y� girin : ");
		number2 = scan.nextInt();
		if (number2 == 0) {
			System.out.println("0'a b�l�m tan�ms�zd�r.\n");
		} else {
			result = number1 / number2;
			System.out.println("Sonu� : " + result + "\n");
		}

	}

	static void power() {
		Scanner scan = new Scanner(System.in);
		int base, exponent, result = 1;
		System.out.print("Taban de�eri : ");
		base = scan.nextInt();
		System.out.print("�s de�eri : ");
		exponent = scan.nextInt();

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		System.out.println("Sonu� : " + result + "\n");
	}

	static void factorial() {
		Scanner scan = new Scanner(System.in);
		int input, result = 1;
		System.out.print("Fakt�riyeli al�nacak say� : ");
		input = scan.nextInt();

		for (int i = 1; i <= input; i++) {
			result *= i;
		}
		System.out.println("Sonu� : " + result + "\n");
	}

	static void mod() {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.print("Modu al�nacak say� : ");
		number1 = scan.nextInt();
		System.out.print("Al�nacak mod de�eri : ");
		number2 = scan.nextInt();
		System.out.println("Sonu� : " + (number1 % number2) + "\n");

	}

	static void rectangle() {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.print("Uzun kenar� girin : ");
		number1 = scan.nextInt();
		System.out.print("K�sa kenar� girin : ");
		number2 = scan.nextInt();
		System.out.println("Dikd�rtgenin Alan� : " + (number1 * number2) + " - �evresi : " + (2 * (number1 + number2)) + "\n");
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int select;
		do {
			System.out.println("1- Toplama\n2- ��karma\n3- �arpma\n4- B�lme\n5- �s Alma\n6- Fakt�riyel Hesaplama\n"
					+ "7- Mod Alma\n8- Dikd�rtgen Alan-�evre Hesab�\n0- ��k��\n");
			System.out.print("Bir i�lem se�in : ");
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
				System.out.println("Yanl�� ��lem Se�imi!\n");
			}

		} while (select != 0);
	}

}
