package Assignments.FirstSemester.Assignment4;
import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		int userinput, randNum = 0;
		while (loop) {
			System.out.print("User guess: ");
			userinput = input.nextInt();
			
			randNum = (int) (Math.random()*(10)+1);
			System.out.println("Computer guess: "+randNum);
			
			if (userinput == randNum) {
				System.out.println("Good Guess");
				break;
				// or loop = false;
			} else if (userinput > randNum) {
				System.out.println("Too high, try again");
			} else if (userinput < randNum) {
				System.out.println("Too low, try again");
			}
		}
		input.close();
	}

}
