import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int select;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hava Durumu\n1- S�cakl�k 5 derecenin alt�nda\n2- S�cakl�k 5-15 derece aras�nda\n3- S�cakl�k 15-25 derece aras�nda\n4- S�cakl�k 25 derecenin �st�nde");
		System.out.print("\nEtkinlik �nerisi i�in se�im yap�n (1-2-3-4) : ");
		select = scan.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Etkinlik �nerisi : Kayak");
			break;
		case 2:
			System.out.println("Etkinlik �nerisi : Sinema");
			break;
		case 3:
			System.out.println("Etkinlik �nerisi : Piknik");
			break;
		case 4:
			System.out.println("Etkinlik �nerisi : Y�zme");
			break;
		default:
			System.out.println("Ge�erli bir se�im yap�n!");
			break;
		}
	}

}
