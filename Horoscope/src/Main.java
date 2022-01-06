import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String month;
		int day;
		Scanner scan = new Scanner(System.in);
		System.out.print("Doğduğunuz Ay : ");
		month = scan.nextLine().toLowerCase();
		System.out.print("Doğdunuz Gün : ");
		day = scan.nextInt();
		
		if(month.equals("ocak")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 21) {
					System.out.println("Oğlak Burcu");
				}
				else
					System.out.println("Kova Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("şubat")) {
			if(day >= 1 && day <= 29) {
				if(day >= 1 && day <= 19) {
					System.out.println("Kova Burcu");
				}
				else
					System.out.println("Balık Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("mart")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 20) {
					System.out.println("Balık Burcu");
				}
				else
					System.out.println("Koç Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("nisan")) {
			if(day >= 1 && day <= 30) {
				if(day >= 1 && day <= 20) {
					System.out.println("Koç Burcu");
				}
				else
					System.out.println("Boğa Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("mayıs")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 21) {
					System.out.println("Boğa Burcu");
				}
				else
					System.out.println("İkizler Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("haziran")) {
			if(day >= 1 && day <= 30) {
				if(day >= 1 && day <= 22) {
					System.out.println("İkizler Burcu");
				}
				else
					System.out.println("Yengeç Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("temmuz")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 22) {
					System.out.println("Yengeç Burcu");
				}
				else
					System.out.println("Aslan Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("ağustos")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 22) {
					System.out.println("Aslan Burcu");
				}
				else
					System.out.println("Başak Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("eylül")) {
			if(day >= 1 && day <= 30) {
				if(day >= 1 && day <= 22) {
					System.out.println("Başak Burcu");
				}
				else
					System.out.println("Terazi Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
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
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("kasım")) {
			if(day >= 1 && day <= 30) {
				if(day >= 1 && day <= 21) {
					System.out.println("Akrep Burcu");
				}
				else
					System.out.println("Yay Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
		else if(month.equals("aralık")) {
			if(day >= 1 && day <= 31) {
				if(day >= 1 && day <= 21) {
					System.out.println("Yay Burcu");
				}
				else
					System.out.println("Oğlak Burcu");
			}
			else
				System.out.println("Geçersiz gün!");
		}
	}

}
