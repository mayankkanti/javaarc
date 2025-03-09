package Assignments.FirstSemester.Assignment7;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[101];
		
		System.out.print("Enter the integers between 1 and 100: ");
		while (true) {
			int input = sc.nextInt();
			if (input == 0) {
				break;
			}
			arr[input]++;
		}
		for (int i=1; i<arr.length; i++) {
			if (arr[i]>0) {
				System.out.println(i+" occurs "+arr[i]+(arr[i]>1?" times.":" time."));
			}
		}
		sc.close();
	}

}

