import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number, sum = 0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Bir sayý girin : ");
			number = scan.nextInt();
			if(number % 4 == 0) {
				sum += number;
			}
		}while(number % 2 == 0);
		System.out.println("Toplam : "+sum);

	}

}
