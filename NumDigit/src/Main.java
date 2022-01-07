import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number, sum = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Pozitif Bir Tamsayı Girin : ");
		number = scan.nextInt();
		
		while(number > 0) {
			sum += number % 10;
			number /= 10;
		}
		System.out.println("Girilen Sayının Basamakları Toplamı = "+sum);

	}

}
