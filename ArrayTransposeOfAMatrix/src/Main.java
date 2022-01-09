
public class Main {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,6}};
		int[][] newArr = new int[arr[0].length][arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				newArr[j][i] = arr[i][j];
			}
		}
		
		System.out.println("Matrix");
		for(int[] row : arr) {
			for(int col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nTranspose");
		for(int[] row : newArr) {
			for(int col : row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
