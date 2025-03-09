package Assignments.FirstSemester.Assignment5;

public class Q7 {

	public static void main(String[] args) {
		int n = 5;
		// (a)
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				char bit = (char) (64+j);
				System.out.print(bit + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		// (b)
		for (int i=n; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		
		System.out.println();
		// (c)
		for (int i=1; i<=n; i++) {
			for (int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}


	}

}

