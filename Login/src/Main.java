import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Login
		
		String userName, password, newPassword;
		String select;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullanýcý Adýnýzý Girin : ");
		userName = scan.nextLine();
		System.out.print("Parolanýzý Girin : ");
		password = scan.nextLine();
		
		if(userName.equals("user") && password.equals("1234")) {
			System.out.println("Baþarýlý bir þekilde giriþ yaptýnýz.");
		}
		else if(userName.equals("user") && !password.equals("1234")) {
			System.out.print("Þifreniz yanlýþ!\nÞifrenizi sýfýrlamak ister misiniz? <E>vet - <H>ayýr : ");
			select = scan.nextLine().toUpperCase();
			switch(select) {
			case "E":
				System.out.print("Yeni Þifre : ");
				newPassword = scan.nextLine();
				System.out.println((newPassword.equals(password) ? "Þifre oluþturuldu." : "Þifre oluþturulamadý, lütfen baþka þifre giriniz."));
				break;
			case "H":
				System.out.println("Çýkýþ yapýlýyor...");
				break;
			}
			
		}
		else {
			System.out.println("Kullanýcý adý ya da þifre yanlýþ!");
		}
	}

}
