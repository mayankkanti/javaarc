import java.util.Scanner;

public class Q10 {
	public static int[] eliminateDuplicates(int[] list) {
		int[] output = null;
		
		// Add functionality for 
		return output;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 10;
		int[] arr = new int[n];

		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The distinct numbers are: "+eliminateDuplicates(arr));
	}

}
