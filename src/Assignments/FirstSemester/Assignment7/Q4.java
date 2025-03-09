package Assignments.FirstSemester.Assignment7;
import java.util.Scanner;
public class Q4 {
	public static double min(double[] array) {
		double smallest = array[0]; // assuming the first element is the smallest
		for (int i=1; i<10; i++) {
			if (array[i]<smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		
		System.out.println("Enter 10 elements to the list: ");
		for (int i=0; i<10; i++) {
			arr[i] = sc.nextDouble();
		}
		System.out.println("The smallest element in the list is "+min(arr));
	}

}

