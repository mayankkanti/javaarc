package Assignments.FirstSemester.Assignment7;
import java.util.Scanner;

public class Q10 {
	public static int[] eliminateDuplicates(int[] list) {
		// making a temp arr of size list.length because if all the elements are
		// distinct then there would be atleast list.length elements
		int[] temp_arr = new int[list.length];
		// this would later determine the length of output array
		int temp_size = 0;

		for (int i = 0; i < list.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < temp_size; j++) {
				if (list[i] == temp_arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				temp_arr[temp_size] = list[i];
				temp_size++;
			}
		}

		// or use int[] output = Arrays.copyOf(temp_arr, temp_size);
		// https://www.datacamp.com/doc/java/copyof
		// (but this without using arrays utils

		int[] output = new int[temp_size];
		for (int i = 0; i < temp_size; i++) {
			output[i] = temp_arr[i];
		}

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

		int[] result_arr = eliminateDuplicates(arr);

		System.out.print("Output Array: [");
		for (int i = 0; i < result_arr.length; i++) {
			System.out.print(result_arr[i] + (i == result_arr.length - 1 ? "]" : ", "));
		}
		System.out.println();
	}

}

