package Assignments.FirstSemester.Assignment4;
public class HAQ2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 2; i < 1000; i++) {
			if (i % 3 == 0) {
				// System.out.println(i);
				sum += i;
			} else if (i % 5 == 0) {
				// System.out.println(i);
				sum += i;
			}
		}
		System.out.println("The sum is: " + sum);
	}

}
