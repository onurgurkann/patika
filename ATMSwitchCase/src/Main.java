import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName, password;
		int errorLog = 3;
		int input, price;
		int balance = 1500;
		Scanner scan = new Scanner(System.in);
		
		while(errorLog > 0) {
			System.out.print("Kullanýcý Adý : ");
            userName = scan.nextLine();
            System.out.print("Parola : ");
            password = scan.nextLine();
            
            if(userName.equals("user") && password.equals("1234")) {
            	System.out.println("Ýyi Günler. Bankamýza Hoþ Geldiniz.\n");
            	do {
            		System.out.println("Ýþlem Menüsü\n-----------------------");
                	System.out.println("1- Para Yatýrma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çýkýþ\n-----------------------");
                	System.out.print("Yapmak Ýstediðiniz Ýþlemi Seçin : ");
                	input = scan.nextInt();
                	
                	switch(input) {
                	case 1:
                		System.out.print("Yatýrmak Ýstediðiniz Tutar : ");
                		price = scan.nextInt();
                		balance += price;
                		break;
                	case 2:
                		System.out.print("Çekmek Ýstediðiniz Tutar : ");
                		price = scan.nextInt();
                		if(price > balance) {
                			System.out.println("Bakiye Yetersiz!");
                		}
                		else {
                			balance -= price;
                		}
                		break;
                	case 3:
                		System.out.println("Hesabýnýzdaki Bakiye : "+balance);
                		break;
                	case 4:
                		System.out.println("Çýkýþ Yapýlýyor...");
                		break;
                	default:
                		System.out.println("Geçerli Bir Ýþlem Seçiniz!");
                		break;
                	}
            	}while(input != 4);
            	System.out.println("Görüþmek Üzere.");
            	break;
            }
            else {
            	errorLog--;
            	System.out.println("Kullanýcý Adý veya Þifre Hatalý! Tekrar Deneyiniz.");
            	if(errorLog == 0) {
            		System.out.println("Hesabýnýz Bloke Olmuþtur! Lütfen Bankamýz Ýle Ýletiþime Geçiniz.");
            	}
            	else {
            		System.out.println("Kalan Giriþ Hakký : "+errorLog);
            	}
            }
		}
		
		
	}

}
