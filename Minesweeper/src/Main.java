import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// minesweeper
		int row, col;
		Scanner scan = new Scanner(System.in);
		System.out.print("Row : ");
		row = scan.nextInt();
		System.out.print("Col : ");
		col = scan.nextInt();
		System.out.println("==================");
		MineSweeper m = new MineSweeper(row,col);
		m.run();

	}

}
