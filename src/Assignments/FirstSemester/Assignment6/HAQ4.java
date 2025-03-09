package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;

public class HAQ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userinput = sc.nextLine();
		// Assuming that the user doesnt inputs a empty string
		// or else this code should fix
		
//		 while(userinput.length()==0) {
//			 System.out.println("The String Can't be empty, please enter a string again." ); 
//			 System.out.print("Enter a string: "); 
//			 userinput = sc.nextLine();
//			 }
		 

		int wordcount = 0;
		for (int i = 0; i < userinput.length(); i++) {
			if (userinput.charAt(i) == ' ' || userinput.charAt(i) == '.') {
				wordcount++;
			}
		}
		// Accounting for the last word if it doesnt end with a "." or " "
		if (Character.isLetterOrDigit(userinput.charAt(userinput.length() - 1))) {
			wordcount++;
		}
		System.out.println("Word Count = " + wordcount);
		sc.close();
	}

}

