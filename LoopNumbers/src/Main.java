import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int number, counter = -1, sum = 0;
		double average;
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir say� girin : ");
		number = scan.nextInt();

		for (int i = 0; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				sum += i;
				counter++;
			}
		}
		if(counter == 0) {
			System.out.println("Girilen Say�ya Kadar 3 ve 4'e Tam B�l�nen Say� Yok!\nOrtalama = 0");
		}
		else {
			average = sum / counter;
			System.out.println("3 ve 4'e Tam B�l�nen Say�lar�n Ortalamas� = " + average);
		}
		
	}

}
