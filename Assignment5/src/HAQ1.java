
public class HAQ1 {

	public static void main(String[] args) {
		int n = 5;
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (count == j) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
			}
			count++;
			System.out.println();

		}

	}

}
