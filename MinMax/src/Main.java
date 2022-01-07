import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Min-Max
		
		int number, input, min = 0, max = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ka� tane say� gireceksiniz : ");
		number = scan.nextInt();
			
		for(int i = 1; i <= number; i++) {
			System.out.print(i+". Say�y� Girin : ");
			input = scan.nextInt();
			
			if(min == 0 || max == 0) {
				min = input;
				max = input;
			}
			else {
				if(input < min) {
					min = input;
				}
				else if(input > max) {
					max = input;
				}
			}
		}
		System.out.println("En K���k Say� : "+min);
		System.out.println("En B�y�k Say� : "+max);

	}

}
