import java.util.Scanner;

public class Main {
	
	static void isPalindrome(int number) {
		int newNumber = 0, temp, remaining;
		temp = number;
		while(temp != 0) {
			remaining = temp % 10;
			newNumber = newNumber * 10 + remaining;
			temp = temp / 10;
		}
		
		if(newNumber == number) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Number : ");
		int number = scan.nextInt();
		
		isPalindrome(number);

	}

}
