import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x, y, sum = 1;
		Scanner scan = new Scanner(System.in);

		System.out.print("Üssü Alýnacak Sayý : ");
		x = scan.nextInt();
		System.out.print("Üs : ");
		y = scan.nextInt();
		
		for(int i = 1; i <= y ; i++) {
			sum *= x;
		}
		System.out.println(x+"^"+y+" = "+sum);
	}

}
