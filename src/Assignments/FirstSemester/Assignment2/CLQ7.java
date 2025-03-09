package Assignments.FirstSemester.Assignment2;

/*Write a java program that takes three positive integers from command-line arguments and
prints true if any one of them is less than or equal to the product of the other two and false
otherwise.*/
public class CLQ7 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);	
		if ((a <= b * c) && (b <= a * c) && (c <= a * b)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
