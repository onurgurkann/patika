import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.print("Y�l Girin : ");
		year = scan.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println(year+" bir art�k y�ld�r.");
				}
				else
					System.out.println(year+" bir art�k y�l de�ildir.");
			}
			else
				System.out.println(year+" bir art�k y�ld�r.");
		}
		else
			System.out.println(year+" bir art�k y�l de�ildir!");
	}

}
