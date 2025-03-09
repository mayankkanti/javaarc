import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int firstNum, secondNum, thirdNum;
		System.out.println("Input first number: ");
		firstNum = input.nextInt();
		System.out.println("Input second number: ");
		secondNum = input.nextInt();
		System.out.println("Input third number");
		thirdNum = input.nextInt();
        if (firstNum < secondNum && secondNum < thirdNum) {
            System.out.println("Increasing");
        } else if (firstNum > secondNum && secondNum > thirdNum) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }
	}
}



/*
 * Input first number: 
 * 23 
 * Input second number: 
 * 25 
 * Input third number 
 * 26
 * Increasing
 */
