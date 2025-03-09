package Assignments.FirstSemester.Assignment7;
import java.util.Random;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter the length of array: ");
		int arraylength = sc.nextInt();
		int[] arr = new int[arraylength];
		System.out.println("Generating random numbers into the array...");
		System.out.print("Randomly Generated Array: [");
		for (int i=0; i<arr.length; i++) {
			arr[i]=rand.nextInt(100);
			System.out.print(arr[i]+(i==arr.length-1?"]":", "));
		}
		System.out.println();
		
		
		int n = arr.length;
		for (int i=0; i<n; i++) {
			int j = (n-1) - i;
			// Swapping the elements in i and j indexes
			if (i<j) {
				int temp = 0;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.print("Reversed Array: [");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+(i==arr.length-1?"]":", "));
		}
		System.out.println();
		sc.close();
	}

}

