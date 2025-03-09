package Assignments.SecondSemester.Assignment1;
package lab_assignments;

public class Q1 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int count = 0;
		while (num > 2) {
			num /= 2;
			count++;
		}
		System.out.println("The positive integer greater than 2 from command line argument is "+ args[0]);
		System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+count);
		
	}

}

