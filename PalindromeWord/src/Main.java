import java.util.Scanner;

public class Main {
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i-- ) {
			reverse += str.charAt(i);
		}
		if(str.equals(reverse)) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		
		String word;
		Scanner scan = new Scanner(System.in);
		System.out.print("Word : ");
		word = scan.nextLine();
		boolean status = isPalindrome(word);
		
		if(status) {
			System.out.println(word+" -> palindrome");
		}
		else
			System.out.println(word+" -> not palindrome");

	}

}
