package Assignments.FirstSemester.Assignment5;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		
		// reversing
		int reversed = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            reversed = reversed * 10 + digit;
        }
        
        // adding params
        boolean isNumPrime = true;
        boolean isReversedPrime = true;
        
        // check if the num and reversed num are prime or nah
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isNumPrime = false;
                break;
            }
        }

        for (int i = 2; i <= Math.sqrt(reversed); i++) {
            if (reversed % i == 0) {
                isReversedPrime = false;
                break;
            }
        }
        
        // Output
        if (isNumPrime && isReversedPrime) {
            System.out.printf("%d is a twisted prime.", num);
        } else {
            System.out.printf("%d is not a twisted prime.", num);
        }
        input.close();
    }
}

