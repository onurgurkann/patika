import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Yar��ap� r, merkez �l��s� a olan daire diliminin alan�n� hesaplayan program
		
		double PI = 3.14;
		int r, merkezAci;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dairenin Yar��ap�n� Girin : ");
		r = scan.nextInt();
		System.out.print("Alan� Hesaplanacak Merkez A��s� : ");
		merkezAci = scan.nextInt();
		
		System.out.println("Yar��ap� "+r+" ve merkez a��s� "+merkezAci+" olan daire "
				+ "diliminin alan� = "+(PI*(r*r)*merkezAci)/360);

	}

}
