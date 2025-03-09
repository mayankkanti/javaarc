import java.util.Scanner;
public class HAQ4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("For input, N = ");
		int n = input.nextInt();
		int evensum=0;
		long oddproduct=1;
		for (int i=1; i<=n; i++) {
			if (i%2==0) {
				evensum += i;
			
			} else {
				oddproduct *= i;
			}
		}
		System.out.println("Sum of all even numbers = "+evensum);
		System.out.println("Product of all odd numbers = "+oddproduct);
	}
}
