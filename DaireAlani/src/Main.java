import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Yarýçapý r, merkez ölçüsü a olan daire diliminin alanýný hesaplayan program
		
		double PI = 3.14;
		int r, merkezAci;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dairenin Yarýçapýný Girin : ");
		r = scan.nextInt();
		System.out.print("Alaný Hesaplanacak Merkez Açýsý : ");
		merkezAci = scan.nextInt();
		
		System.out.println("Yarýçapý "+r+" ve merkez açýsý "+merkezAci+" olan daire "
				+ "diliminin alaný = "+(PI*(r*r)*merkezAci)/360);

	}

}
