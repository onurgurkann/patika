import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x, y, sum = 1;
		Scanner scan = new Scanner(System.in);

		System.out.print("�ss� Al�nacak Say� : ");
		x = scan.nextInt();
		System.out.print("�s : ");
		y = scan.nextInt();
		
		for(int i = 1; i <= y ; i++) {
			sum *= x;
		}
		System.out.println(x+"^"+y+" = "+sum);
	}

}
