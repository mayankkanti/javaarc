package Assignments.FirstSemester.Assignment2;
import java.util.Scanner; 
public class HAQ2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalEggs ,countDozen, countLeftover, countGross;
		System.out.print("Enter the number of Eggs(int): ");
		totalEggs = input.nextInt();
		countGross = totalEggs/144;
		countDozen = (totalEggs%144)/12;
		countLeftover = totalEggs%12;
		System.out.println("Your number of eggs is "+countGross+" gross, "+countDozen+" dozen, and "+countLeftover+" leftover.");
		input.close();
	}

}
