import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 20, 10, 10, 20, 5};
		int count = 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(i == 0 && arr[i+1] == arr[i]) {
				System.out.println(arr[i]+" -> "+count+" times");
			}
			if(i == 0 && arr[i+1] != arr[i]) {
				System.out.println(arr[i]+" -> "+count+" times");
			}
			if(i != 0 && arr[i-1] != arr[i]) {
				System.out.println(arr[i]+" -> "+count+" times");
			}
		}

		
	}

}
