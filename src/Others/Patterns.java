package Others;
public class Patterns {
	static void pattern1(int rows) {
		System.out.println("Pattern 1");
		System.out.println();
		
		boolean placeHolder = true;
		String line, temp;
		line = "";
		for (int i = 0; i < rows; i++) {
			temp = placeHolder ? "1" : "0";
			line = temp + line;
			placeHolder = !placeHolder;
			System.out.println(line);
		}
	}
	
	static void pattern2(int rows) {
		System.out.println("Pattern 2");
		System.out.println();
		
		for (int i=0; i < rows; i++) {
			for (int j=rows; j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	static void pattern3(int rows) {
		System.out.println("Pattern 3");
		System.out.println();
		
		for (int i=1; i<=rows; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	static void pattern4(int rows) {
		System.out.println("Pattern 4");
		System.out.println();
		
		for (int i=0; i<rows;i++) {
			for (int j=0; j<rows; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern5(int rows) {
		System.out.println("Pattern 5");
		System.out.println();
		
		for (int i=1; i<=rows; i++) {
			for (int j=i; j<rows; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern6(int rows) {
		System.out.println("Pattern 6");
		System.out.println();
		
		for (int i=1; i<=rows; i++) {
			for (int j=i; j<rows; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int rows) {
		System.out.println("Pattern 7");
		System.out.println();
		
		int count = 1;
		for (int i=1; i<rows; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
		pattern2(n);
		pattern3(n);
		pattern4(n);
		pattern5(n);
		pattern6(n);
		pattern7(n);
	}

}