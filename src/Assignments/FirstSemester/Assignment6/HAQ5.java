package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class HAQ5 {
	public static boolean isConsecutive(int first, int second, int third) {
		if ((first == second-1)&&(first == third-2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int first = sc.nextInt();
		System.out.print("Input the second number: ");
		int second = sc.nextInt();
		System.out.print("Input the third number: ");
		int third = sc.nextInt();
		System.out.println("Whether the three said numbers are consecutive or not?:"+isConsecutive(first, second, third));
	}

}

