package Assignments.SecondSemester.Assignment1;
package lab_assignments;

import java.util.Scanner;
public class Q5 {
	
	public static int sum_Of_Digits(int num) {
		int sum = 0;
		while (num > 0 || sum >= 10) {
			sum += num % 10;
            num = num / 10;
            if (num == 0) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		System.out.println("Sum of digits of the number is: "+sum_Of_Digits(num));
		
		sc.close();
	}
}

