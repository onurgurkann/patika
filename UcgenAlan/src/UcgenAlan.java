import java.util.Scanner;

public class UcgenAlan {

	public static void main(String[] args) {
		// �� kenar uzunlu�u bilinen ��genin alan�n� hesaplayan program
		
		int kenar1, kenar2, kenar3;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��genin ilk kenar�n� girin : ");
		kenar1 = scan.nextInt();
		System.out.print("��genin ikinci kenar�n� girin : ");
		kenar2 = scan.nextInt();
		System.out.print("��genin ���nc� kenar�n� girin : ");
		kenar3 = scan.nextInt();
		
		double u = (kenar1 + kenar2 + kenar3) / 2;
		System.out.println("��genin Alan� : "+Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)));

	}

}
