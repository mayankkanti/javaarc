import java.util.Scanner;
public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int newNum = 0, q=num, bit;
		while (q!=0) {
			bit = q%10;
			newNum += Math.pow(bit,3);
			q = q/10;
		}
		
		if (newNum == num) {
			System.out.println("Yes the number is a Armstrong Number.");
			
		} else {
			System.out.println("No the number is not Armstrong Number.");
		}
	}

}
