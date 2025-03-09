package Assignments.FirstSemester.Assignment6;

public class Q2 {
	public static int getPentagonalNumber(int n) {
		int result = (n*(3*n-1)/2);
		return result;
	}
	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if (i%10!=0) {
				System.out.print(getPentagonalNumber(i)+" ");
			} else {
				System.out.println(getPentagonalNumber(i));
			}
		}

	}

}

