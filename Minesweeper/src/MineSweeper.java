import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	int row, col, mineNumber;
	String[][] arr;
	int[][] tempArr;
	boolean game = true;
	Scanner scan = new Scanner(System.in);
	Random r = new Random();

	public MineSweeper(int row, int col) {
		this.row = row;
		this.col = col;
		this.arr = new String[row][col];
		this.tempArr = new int[row][col];
		this.mineNumber = row * col / 4; // numbers of mines
	}
	
	public void run() {
		int guessRow, guessCol, success = 0;
		fillGame();
		print2(arr);
		System.out.println("==================");
		System.out.println("And it's game on!");
		System.out.println("==================");
		
		while(game) {
			print(tempArr);
			System.out.print("Row : ");
			guessRow = scan.nextInt();
			System.out.print("Col : ");
			guessCol = scan.nextInt();
			System.out.println("==================");
			if(guessRow < 0 || guessRow >= row) {
				System.out.println("Invalid coordinate!");
				continue;
			}
			if(guessCol < 0 || guessCol >= col) {
				System.out.println("Invalid coordinate!");
				continue;
			}
			
			if(arr[guessRow][guessCol] != "*") {
				checkMine(guessRow, guessCol);
				success++;
				if(success == (row*col - (mineNumber))) {
					System.out.println("Congratulations!");
					break;
				}
			}
			else {
				game = false;
				System.out.println("Game Over!");
			}
		}
	}
	
	public void checkMine(int guessRow, int guessCol) {
		if(guessRow-1 >= 0 && arr[guessRow-1][guessCol] == "*") {
			tempArr[guessRow][guessCol]++;
		}
		if(guessRow-1 >= 0 && guessCol-1 >= 0 && arr[guessRow-1][guessCol-1] == "*") {
			tempArr[guessRow][guessCol]++;
		}
		if(guessRow-1 >= 0 && guessCol+1 < col && arr[guessRow-1][guessCol+1] == "*") {
			tempArr[guessRow][guessCol]++;
		}
		if(guessCol-1 >= 0 && arr[guessRow][guessCol-1] == "*") {
			tempArr[guessRow][guessCol]++;
		}
		if(guessCol+1 < col && arr[guessRow][guessCol+1] == "*") {
			tempArr[guessRow][guessCol]++;
		}
		if(guessRow+1 < row && arr[guessRow+1][guessCol] == "*") {
			tempArr[guessRow][guessCol]++;
		}
		if(guessRow+1 < row && guessCol-1 >= 0 && arr[guessRow+1][guessCol-1] == "*") {
			tempArr[guessRow][guessCol]++;
		}		
		if(guessRow+1 < row && guessCol+1 < col && arr[guessRow+1][guessCol+1] == "*") {
			tempArr[guessRow][guessCol]++;
		}
	}
	
	public void fillGame() {
		int rowN, colN, count = 0;
		while(count != mineNumber) {
			rowN = r.nextInt(row);
			colN = r.nextInt(col);
			if(arr[rowN][colN] != "*") {
				arr[rowN][colN] = "*";
				count++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] != "*") {
					arr[i][j] = "-";
				}
			}
		}
	}
	
	public void print2(String[][] arr) {
		for(String[] row : arr) {
			for(String col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

	public void print(int[][] arr) {	
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
