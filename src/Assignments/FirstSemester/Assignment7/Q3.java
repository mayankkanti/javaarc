package Assignments.FirstSemester.Assignment7;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.println("Enter 10 elements to the list: ");
		for (int i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter the number to be searched: ");
		int n = sc.nextInt();
		int count = 0;
		for (int i=0; i<10; i++) {
			if (arr[i]==n) {
				count++;
			}
		}
		System.out.println("The element "+n+" appeared "+count+(count>1?" times.":"time."));
		sc.close();
	}

}

