import java.util.Scanner;

public class Main {

	static void Minus(int number, int temp, boolean value) {
		int x;
		System.out.print(temp+" ");
		
		if(temp <= 0 ) {
			value = false;
		}
		x = value ? temp - 5 : temp + 5;
		
		if(x <= number) {
			Minus(number, x, value);
		}
	}
	
	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		number = scan.nextInt();
		Minus(number, number, true);

	}

}