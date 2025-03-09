package Assignments.FirstSemester.Assignment3;
import java.util.Scanner;

public class HAQ2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int future = input.nextInt();
		int futureday = (today + future) % 6;

		String todayStr;
		switch (today) {
		case 0:
			todayStr = "Today is Sunday";
			break;
		case 1:
			todayStr = "Today is Monday. ";
			break;
		case 2:
			todayStr = "Today is Tuesday. ";
			break;
		case 3:
			todayStr = "Today is Wednesday. ";
			break;
		case 4:
			todayStr = "Today is Thursday. ";
			break;
		case 5:
			todayStr = "Today is Friday. ";
			break;
		case 6:
			todayStr = "Today is Saturday. ";
			break;
		default:
			todayStr = "Invalid day number.";
			break;
		}
		switch (futureday) {
		case 0:
			System.out.println(todayStr + "The future day is Sunday.");
			break;
		case 1:
			System.out.println(todayStr + "The future day is Monday.");
			break;
		case 2:
			System.out.println(todayStr + "The future day is Tuesday.");
			break;
		case 3:
			System.out.println(todayStr + "The future day is Wednesday.");
			break;
		case 4:
			System.out.println(todayStr + "The future day is Thrusday.");
			break;
		case 5:
			System.out.println(todayStr + "The future day is Friday.");
			break;
		case 6:
			System.out.println(todayStr + "The future day is Saturday.");
			break;
		default:
			System.out.println(todayStr);
			break;
		}
		input.close();

	}

}