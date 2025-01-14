import java.util.Scanner;

public class PasswordChecker {
	static boolean isPasswordStrong(String password) {

		if (password.length() < 8) {
			return false;
		}
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasSpace = false;
		boolean hasDigit = false;
		boolean hasSpecialChar = false;

		for (int i = 0; i < password.length(); i++) {
			char letter = password.charAt(i);
			if (Character.isUpperCase(letter)) {
				hasUpperCase = true;
			} else if (Character.isLowerCase(letter)) {
				hasLowerCase = true;
			} else if (Character.isSpaceChar(letter)) {
				hasSpace = true;
			} else if (Character.isDigit(letter)) {
				hasDigit = true;
			} else if (!Character.isLetterOrDigit(letter) & !Character.isSpaceChar(letter)) {
				hasSpecialChar = true;
			}
		}

		return hasUpperCase && hasLowerCase && !hasSpace && hasDigit && hasSpecialChar;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter a password: ");
			String password = input.next();
			if (isPasswordStrong(password)) {
				System.out.println("The password meets the criteria.");
				break;
			} else {
				System.out.println("The password doesn't meet the criteria. Try Again");
			}
		}
		input.close();
	}

}
