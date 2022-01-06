import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Hesap Makinesi

		int number1, number2, select;
		Scanner scan = new Scanner(System.in);
		System.out.print("�lk say�y� girin : ");
		number1 = scan.nextInt();
		System.out.print("�kinci say�y� girin : ");
		number2 = scan.nextInt();
		System.out.println("\n1- Toplama\n2- ��karma\n3- �arpma\n4- B�lme");
		System.out.print("��lem Se�in (1-2-3-4) : ");
		select = scan.nextInt();

		switch (select) {
		case 1:
			System.out.println("Toplam : " + (number1 + number2));
			break;
		case 2:
			System.out.println("Fark : " + (number1 - number2));
			break;
		case 3:
			System.out.println("�arp�m : " + (number1 * number2));
			break;
		case 4:
			if(number2 == 0) {
				System.out.println("B�lme sonucu tan�ms�z.");
			}
			else {
				System.out.println("B�l�m : " + (number1 / number2));
			}
			break;
		default:
			System.out.println("L�tfen ge�erli bir i�lem se�iniz!");
			break;
		}

	}

}
