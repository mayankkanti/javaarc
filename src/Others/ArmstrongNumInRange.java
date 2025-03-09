package Others;
import java.util.Scanner;
public class ArmstrongNumInRange {
	static boolean isArmstrong(int num) {
		int newNum = 0, q=num, bit;
	       int digits = 0, temp = num;
	        while (temp != 0) {
	            digits++;
	            temp /= 10;
	        }
		
		while (q!=0) {
			bit = q%10;
			newNum += Math.pow(bit,digits);
			q = q/10;
		}
		if (newNum == num) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the range val1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the range val2: ");
		int num2 = sc.nextInt();
		for (int num = num1; num <=num2; num++) {
			if (isArmstrong(num)) {
				System.out.println(num);
			}
		}
		sc.close();
	}

}
