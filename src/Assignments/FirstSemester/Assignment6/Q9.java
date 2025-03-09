package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class Q9 {
	public static boolean passwordChecker(String str) {
		boolean length = false;
		boolean hasSpecialchar = false;
		boolean atleast2dig = false;
		int digitcount = 0;
		
		for (int i=0; i<str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digitcount+=1;
			}
			if (!Character.isLetterOrDigit(str.charAt(i))) {
				hasSpecialchar = true;
			}
		}
		if (str.length()>=8) {
			length=true;
		}
		if (digitcount>=2) {
			atleast2dig = true;
		}
		//System.out.println(length + " " + !hasSpecialchar +" "+ atleast2dig);
		return length && !hasSpecialchar && atleast2dig;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Password Rules: ");
		System.out.println("- A password must have at least eight characters.");
		System.out.println("- A password consists of only letters and digits.");
		System.out.println("- A password must contain at least two digits.");
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		if (passwordChecker(password)) {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invaild Password");
		}
	}

}

