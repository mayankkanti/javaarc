package Assignments.FirstSemester.Assignment4;
public class HAQ3 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 1000; i <= 2000; i++) {
			System.out.print(i + " ");
			count++;
			if (count % 5 == 0) {
				System.out.println();
			}
		}

	}

}