import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir Say� Girin : ");
		number = scan.nextInt();
		
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				sum += i;
			}
		}
		if(sum == number) {
			System.out.println(number+" bir m�kemmel say�d�r.");
		}
		else {
			System.out.println(number+" bir m�kemmel say� de�ildir.");
		}
	}

}
