package Assignments.FirstSemester.Assignment7;
import java.util.Random;
import java.util.Scanner;

public class Q11 {
	public static int[] bubblesort(int[] arr) {
		int[] sorted = null;

		int n = arr.length;

		for (int i = 0; i <= n - 1; i++) {
			for (int j = 0; j <= n - i; j++) {
				if (j + 1 < arr.length) {
					if (arr[j] < arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}
		sorted = arr;
		return sorted;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// System.out.print("Enter the length of array: ");
		int arraylength = 10;
		int[] arr = new int[arraylength];
		System.out.println("Generating random numbers into the array...");
		System.out.print("Randomly Generated Array: [");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			System.out.print(arr[i] + (i == arr.length - 1 ? "]" : ", "));
		}
		System.out.println();

		int[] sorted_arr = bubblesort(arr);

		System.out.print("Sorted Array: [");
		for (int i = 0; i < sorted_arr.length; i++) {
			System.out.print(sorted_arr[i] + (i == sorted_arr.length - 1 ? "]" : ", "));
		}
		System.out.println();
		sc.close();
	}

}

