package Assignments.FirstSemester.Assignment7;
import java.util.Random;
import java.util.Scanner;

public class Q12 {
	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int swapindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[swapindex] > arr[j]) {
					swapindex = j;
				}
			}
			// System.out.printf("[Debug] i:%d swapindex:%d",i,swapindex);
			// System.out.println();
			if (i < swapindex) {
				int temp = arr[i];
				arr[i] = arr[swapindex];
				arr[swapindex] = temp;
			}

		}

		return arr;
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

		int[] sorted_arr = selectionSort(arr);

		System.out.print("Sorted Array: [");
		for (int i = 0; i < sorted_arr.length; i++) {
			System.out.print(sorted_arr[i] + (i == sorted_arr.length - 1 ? "]" : ", "));
		}
		System.out.println();
		sc.close();
	}

}

