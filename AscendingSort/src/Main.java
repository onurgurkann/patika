import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		Scanner scan = new Scanner(System.in);
		System.out.print("�lk say�y� girin : ");
		num1 = scan.nextInt();
		System.out.print("�kinci say�y� girin : ");
		num2 = scan.nextInt();
		System.out.print("���nc� say�y� girin : ");
		num3 = scan.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			if(num2 < num3) {
				System.out.println("K���kten b�y��e s�ralama : "+num1+" < "+num2+" < "+num3);
			}
			else
				System.out.println("K���kten b�y��e s�ralama : "+num1+" < "+num3+" < "+num2);
		}
		else if(num2 < num1 && num2 < num3) {
			if(num1 < num3) {
				System.out.println("K���kten b�y��e s�ralama : "+num2+" < "+num1+" < "+num3);
			}
			else
				System.out.println("K���kten b�y��e s�ralama : "+num2+" < "+num3+" < "+num1);
		}
		else if(num3 < num1 && num3 < num2) {
			if(num1 < num2) {
				System.out.println("K���kten b�y��e s�ralama : "+num3+" < "+num1+" < "+num2);
			}
			else
				System.out.println("K���kten b�y��e s�ralama : "+num3+" < "+num2+" < "+num3);
		}

	}

}
