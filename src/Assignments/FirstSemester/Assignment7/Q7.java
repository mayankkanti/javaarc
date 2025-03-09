package Assignments.FirstSemester.Assignment7;
import java.util.Scanner;
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal (int): ");
		int n = sc.nextInt();
		
		int[] arr = new int[32];
		int index = 0;
		
		while (n!=0) {
			arr[index] = n%8;
			n = n / 8;
			index++;
		}
		System.out.print("Octal Representation: ");
		for(int i = index-1; i >=0; i--) {
			System.out.print(arr[i]);
		}
		
		
		
	}

}

