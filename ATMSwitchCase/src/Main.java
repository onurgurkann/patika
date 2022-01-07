import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String userName, password;
		int errorLog = 3;
		int input, price;
		int balance = 1500;
		Scanner scan = new Scanner(System.in);
		
		while(errorLog > 0) {
			System.out.print("Kullan�c� Ad� : ");
            userName = scan.nextLine();
            System.out.print("Parola : ");
            password = scan.nextLine();
            
            if(userName.equals("user") && password.equals("1234")) {
            	System.out.println("�yi G�nler. Bankam�za Ho� Geldiniz.\n");
            	do {
            		System.out.println("��lem Men�s�\n-----------------------");
                	System.out.println("1- Para Yat�rma\n2- Para �ekme\n3- Bakiye Sorgulama\n4- ��k��\n-----------------------");
                	System.out.print("Yapmak �stedi�iniz ��lemi Se�in : ");
                	input = scan.nextInt();
                	
                	switch(input) {
                	case 1:
                		System.out.print("Yat�rmak �stedi�iniz Tutar : ");
                		price = scan.nextInt();
                		balance += price;
                		break;
                	case 2:
                		System.out.print("�ekmek �stedi�iniz Tutar : ");
                		price = scan.nextInt();
                		if(price > balance) {
                			System.out.println("Bakiye Yetersiz!");
                		}
                		else {
                			balance -= price;
                		}
                		break;
                	case 3:
                		System.out.println("Hesab�n�zdaki Bakiye : "+balance);
                		break;
                	case 4:
                		System.out.println("��k�� Yap�l�yor...");
                		break;
                	default:
                		System.out.println("Ge�erli Bir ��lem Se�iniz!");
                		break;
                	}
            	}while(input != 4);
            	System.out.println("G�r��mek �zere.");
            	break;
            }
            else {
            	errorLog--;
            	System.out.println("Kullan�c� Ad� veya �ifre Hatal�! Tekrar Deneyiniz.");
            	if(errorLog == 0) {
            		System.out.println("Hesab�n�z Bloke Olmu�tur! L�tfen Bankam�z �le �leti�ime Ge�iniz.");
            	}
            	else {
            		System.out.println("Kalan Giri� Hakk� : "+errorLog);
            	}
            }
		}
		
		
	}

}
