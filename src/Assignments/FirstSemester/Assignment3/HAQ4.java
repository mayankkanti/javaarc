package Assignments.FirstSemester.Assignment3;
import java.util.Scanner;
public class HAQ4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = input.nextInt();
		boolean and, or;
		and = num%5==0 && num%6==0;
		or = num%5==0 || num%6==0;
		System.out.println("Is "+num+" divisible by 5 and 6? "+and);
		System.out.println("Is "+num+" divisible by 5 or 6? "+or);
		System.out.println("Is "+num+" divisible by 5 or 6, but not both? "+!and);
		input.close();
	}

}
