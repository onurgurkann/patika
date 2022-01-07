import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Min-Max
		
		int number, input, min = 0, max = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kaç tane sayý gireceksiniz : ");
		number = scan.nextInt();
			
		for(int i = 1; i <= number; i++) {
			System.out.print(i+". Sayýyý Girin : ");
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
		System.out.println("En Küçük Sayý : "+min);
		System.out.println("En Büyük Sayý : "+max);

	}

}
