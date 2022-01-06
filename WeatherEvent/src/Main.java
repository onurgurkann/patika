import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int select;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hava Durumu\n1- Sýcaklýk 5 derecenin altýnda\n2- Sýcaklýk 5-15 derece arasýnda\n3- Sýcaklýk 15-25 derece arasýnda\n4- Sýcaklýk 25 derecenin üstünde");
		System.out.print("\nEtkinlik önerisi için seçim yapýn (1-2-3-4) : ");
		select = scan.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Etkinlik Önerisi : Kayak");
			break;
		case 2:
			System.out.println("Etkinlik Önerisi : Sinema");
			break;
		case 3:
			System.out.println("Etkinlik Önerisi : Piknik");
			break;
		case 4:
			System.out.println("Etkinlik Önerisi : Yüzme");
			break;
		default:
			System.out.println("Geçerli bir seçim yapýn!");
			break;
		}
	}

}
