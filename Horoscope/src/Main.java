import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String month;
		int day;
		Scanner scan = new Scanner(System.in);
		System.out.print("Do�du�unuz Ay : ");
		month = scan.nextLine().toLowerCase();
		System.out.print("Do�dunuz G�n : ");
		day = scan.nextInt();
		
		if(month.equals("ocak")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 21) {
					System.out.println("O�lak Burcu");
				}
				else
					System.out.println("Kova Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("�ubat")) {
			if(day >= 1 && day <= 29) {
				if(day >= 1 && day <= 19) {
					System.out.println("Kova Burcu");
				}
				else
					System.out.println("Bal�k Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("mart")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 20) {
					System.out.println("Bal�k Burcu");
				}
				else
					System.out.println("Ko� Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("nisan")) {
			if(day >= 1 && day <= 30) {
				if(day >= 1 && day <= 20) {
					System.out.println("Ko� Burcu");
				}
				else
					System.out.println("Bo�a Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("may�s")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 21) {
					System.out.println("Bo�a Burcu");
				}
				else
					System.out.println("�kizler Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("haziran")) {
			if(day >= 1 && day <= 30) {
				if(day >= 1 && day <= 22) {
					System.out.println("�kizler Burcu");
				}
				else
					System.out.println("Yenge� Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("temmuz")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 22) {
					System.out.println("Yenge� Burcu");
				}
				else
					System.out.println("Aslan Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("a�ustos")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 22) {
					System.out.println("Aslan Burcu");
				}
				else
					System.out.println("Ba�ak Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("eyl�l")) {
			if(day >= 1 && day <= 30) {
				if(day >= 1 && day <= 22) {
					System.out.println("Ba�ak Burcu");
				}
				else
					System.out.println("Terazi Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("ekim")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 22) {
					System.out.println("Terazi Burcu");
				}
				else
					System.out.println("Akrep Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("kas�m")) {
			if(day >= 1 && day <= 30) {
				if(day >= 1 && day <= 21) {
					System.out.println("Akrep Burcu");
				}
				else
					System.out.println("Yay Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
		else if(month.equals("aral�k")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 21) {
					System.out.println("Yay Burcu");
				}
				else
					System.out.println("O�lak Burcu");
			}
			else
				System.out.println("Ge�ersiz g�n!");
		}
	}

}
