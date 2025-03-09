package Assignments.FirstSemester.Assignment3;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int marks = input.nextInt(); // Assuming that the users enter correct marks every time
		int condition = marks / 10;  

		switch (condition) {
		case 10:
			System.out.println("You have scored full marks, Grade O!");
			break;
		case 9:
			System.out.println("Grade O");
			break;
		case 8:
			System.out.println("Grade A");
			break;
		case 7:
			System.out.println("Grade B");
			break;
		case 6:
			System.out.println("Grade C");
			break;
		case 5:
			System.out.println("Grade D");
			break;
		case 4:
			System.out.println("Grade E");
			break;
		default:
			System.out.println("Grade F");
			break;

		}
		input.close();

	}

}

/*
78
Grade B
 */
