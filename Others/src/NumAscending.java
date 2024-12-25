// Questions: To Check if the digits of the given numbers are in ascending order. 
import java.util.Scanner;
public class NumAscending {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new  Scanner(System.in);
		int num = input.nextInt();
		int q = num, val1, val2;
		while (q!=0) {
			if (Integer.toString(num).length()==1) {
				System.out.println("Ascending");
				break;
			}
			else {
				//say num = 12345
				val1 = q%10; // 5
				val2 = (q%100)/10; // 4
				if (val1 < val2) {
					System.out.println("Not Ascending");
					break;
				} 
				q = q/10;
				//System.out.println(String.format("[Debug] Num: %d, q: %d, Comparing val: %d, val2: %d", num, q, val1, val2));
			}
		}
		if (q==0) {
			System.out.println("Ascending");
		}
	}

}
