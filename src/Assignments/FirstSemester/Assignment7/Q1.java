package Assignments.FirstSemester.Assignment7;
import java.util.Scanner;
import java.util.Random;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Enter the length of array: ");
		int n = sc.nextInt();
		int sum = 0;
		int[] arr = new int[n];
		System.out.println("Generating random numbers into the array...");
		for (int i=0; i<arr.length; i++) {
			arr[i]=rand.nextInt(100);
			System.out.println(arr[i]+" was added to the list.");
			sum += arr[i];
		}
		
		int average = sum/5;
		
		System.out.println("The sum is "+sum);
		System.out.println("The average is "+average);
		sc.close();
	}

}

