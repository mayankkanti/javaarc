package Others;
import java.util.Scanner;
public class PerfectNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int newNum=0;
		for (int i=1; i<num; i++) {
			if (num%i==0) {
				newNum += i;
			}
		}
		if (newNum==num) {
			System.out.println("Yes the number is a perfect number.");
		} else {
			System.out.println("No the number is not a perfect number.");
		}
		
		sc.close();
	}

}
