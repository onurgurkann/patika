import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number, health = 5, input, i=0;
		int[] guess = new int[5];
		boolean status = false;
		
		Random rand = new Random();
		number = rand.nextInt(100);
		System.out.println(number);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome...Guess The Number! (1-100)");
		
		while(health > 0) {
			System.out.print("Guess : ");
			input = scan.nextInt();
			if(input < 0 || input > 99) {
				System.out.println("Please, enter the number between 0 and 100.");
				continue;
			}
			
			guess[i++] = input;
			
			if(input == number) {
				status = true;
				break;
			}
			else {
				System.out.println("False! Remaining Health : "+ --health);
			}
		}
		
		if(status) {
			System.out.println("Congratulations!");
			System.out.println("Number : "+number+" Remaining Health : "+ health);
		}
		else {
			System.out.println("Game Over! You lost... Number : "+number);
		}
		
		System.out.print("Guesses : ");
		for(int item : guess) {
			if(item != 0) {
				System.out.print(item+" ");
			}
		}
	}

}
