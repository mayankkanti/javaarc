import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0, min = 9;
		int randomNum = (int) (Math.random() *(max - min + 1) + min);
		System.out.println("Enter user number: ");
		int userinput = input.nextInt();
		if (userinput == randomNum) {
			System.out.println("You got it right");
		} else if (userinput == (randomNum-1) | userinput == (randomNum+1) ) {
			System.out.println("Almost got it");
		} else {
			System.out.println("You got it wrong");
		}

	}

}