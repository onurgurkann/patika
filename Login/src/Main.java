import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Login
		
		String userName, password, newPassword;
		String select;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullan�c� Ad�n�z� Girin : ");
		userName = scan.nextLine();
		System.out.print("Parolan�z� Girin : ");
		password = scan.nextLine();
		
		if(userName.equals("user") && password.equals("1234")) {
			System.out.println("Ba�ar�l� bir �ekilde giri� yapt�n�z.");
		}
		else if(userName.equals("user") && !password.equals("1234")) {
			System.out.print("�ifreniz yanl��!\n�ifrenizi s�f�rlamak ister misiniz? <E>vet - <H>ay�r : ");
			select = scan.nextLine().toUpperCase();
			switch(select) {
			case "E":
				System.out.print("Yeni �ifre : ");
				newPassword = scan.nextLine();
				System.out.println((newPassword.equals(password) ? "�ifre olu�turuldu." : "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz."));
				break;
			case "H":
				System.out.println("��k�� yap�l�yor...");
				break;
			}
			
		}
		else {
			System.out.println("Kullan�c� ad� ya da �ifre yanl��!");
		}
	}

}
