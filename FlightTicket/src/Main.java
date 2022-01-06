import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int distance, age, type;
		double price, ageDiscount, typeDiscount;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mesafeyi Girin : ");
		distance = scan.nextInt();
		System.out.print("Ya��n�z� Girin : ");
		age = scan.nextInt();
		System.out.print("1- Tek Gidi�\n2- Gidi�-D�n��\nYolculuk Tipini Se�in (1-2) : ");
		type = scan.nextInt();
		
		if(distance > 0 && age > 0 || (type == 1 || type == 2)) {
			price = distance * 0.10;
			System.out.println("U�ak Bileti Tutar� : " + price + " TL");
			if(age < 12) {
				ageDiscount = price * 0.5;
			}
			else if(age >= 12 && age <= 24) {
				ageDiscount = price * 0.1;
			}
			else if(age > 65) {
				ageDiscount = price * 0.3;
			}
			else
				ageDiscount = 0;
			
			price -= ageDiscount;
					
			if(type == 2) {
				typeDiscount = price * 0.2;
			}
			else
				typeDiscount = 0;
			
			price = (price - typeDiscount) * 2;
			System.out.println("�ndirimli U�ak Bileti Tutar� : "+price+" TL");
		}
		else {
			System.out.println("Hatal� Veri Girdiniz!");
			
		}
	}

}
