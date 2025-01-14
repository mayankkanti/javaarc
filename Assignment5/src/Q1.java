import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		
		int sum1=0, sum2=0;
		int q1=num1,q2=num2;
		int idx=1;
		while (idx<num1) {
			if (num1%idx==0) {
				sum1+=idx;
			}
			idx++;
		}
		idx = 1;
		while (idx<num2) {
			if (num2%idx==0) {
				sum2+=idx;
			}
			idx++;
		}
		if (sum1==num2 && sum2==num1) {
			System.out.printf("(%d,%d) are amicable numbers",num1,num2);
		} else {
			System.out.printf("(%d,%d) are not amicable numbers",num1,num2);
		}
		input.close();

	}

}
