package Assignments.FirstSemester.Assignment7;
import java.util.Random;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter the length of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Generating random numbers into the array...");
		System.out.print("Array: [");
		for (int i=0; i<arr.length; i++) {
			arr[i]=rand.nextInt(100);
			System.out.print(arr[i]+(i==arr.length-1?"]":", "));
		}
		System.out.println();
		// Modified Code from Q1 to make a list of n elements
		
		// assume the first element to be the biggest
		int biggest = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i]>biggest) {
				biggest = arr[i];
			}
		}
		
		//System.out.println("The biggest element in the list is "+biggest);
		
		int secondbiggest = 0;
		for (int i=1; i<arr.length; i++) {
			if (arr[i]>secondbiggest && arr[i]< biggest) {
				secondbiggest = arr[i];
			}
		}
		
		System.out.println("The 2nd biggest element in the list is "+secondbiggest);

	}

}

