package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class Q7 {
	public static int count(String str) {
		int count = 0;
		for (int i=0; i<str.length(); i++) {
			switch (Character.toLowerCase(str.charAt(i))) {
			case 'a':
				count+=1;
				break;
			case 'e':
				count+=1;
				break;
			case 'i':
				count+=1;
				break;
			case 'o':
				count+=1;
				break;
			case 'u':
				count+=1;
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String userinput = sc.nextLine();
		System.out.println("The number of vowels in the inputted string is : "+count(userinput));
		sc.close();
	}

}

