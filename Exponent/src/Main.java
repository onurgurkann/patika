import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayý girin : ");
		number = scan.nextInt();
		
		for(int i = 0; i <= number; i++) {
			if(i == 0) {
				System.out.println("4^"+i+" = 1");
			}
			else
				System.out.println("4^"+i+" = "+i*4);
		}
		System.out.println();
		for(int i = 0; i <= number; i++) {
			if(i == 0) {
				System.out.println("5^"+i+" = 1");
			}
			else
				System.out.println("5^"+i+" = "+i*5);
		}

	}

}
