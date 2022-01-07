import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Greatest Common Divisor and Least Common Multiple (TR -> EBOB-EKOK)
		
		int number1, number2, min, gcd = 1, lcm;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ýlk Sayýyý Girin : ");
		number1 = scan.nextInt();
		System.out.print("Ýkinci Sayýyý Girin : ");
		number2 = scan.nextInt();
		
		min = (number1 > number2) ? number1 : number2;
		
		int i = min;
		while(i > 0) {
			if(number1 % i == 0 && number2 % i == 0) {
				gcd = i;
				break;
			}
			i--;
		}
		
		lcm = (number1 * number2) / gcd;
		System.out.println(number1+" ve "+number2+" -> EBOB : "+gcd);
		System.out.println(number1+" ve "+number2+" -> EKOK : "+lcm);

	}

}
