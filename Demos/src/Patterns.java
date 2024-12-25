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
	}
	public static void main(String[] args) {
		int n = 4;
		pattern1(n);
		pattern2(n);
		pattern3(n);
	}
}