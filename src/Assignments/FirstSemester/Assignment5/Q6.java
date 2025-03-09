package Assignments.FirstSemester.Assignment5;

public class Q6 {

	public static void main(String[] args) {
		// (a)
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		// (b)
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		// (c)
		int count = 1;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
		
		System.out.println();
		//(d)
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}

