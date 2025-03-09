package Others;
import java.util.Scanner;

public class CaesarCipher {
	static String encrypter(int shift, String text) {
		String output = "";
		for (int i = 0; i < text.length(); i++) {
			char Char = text.charAt(i);
			if (Character.isLowerCase(Char)) {
				char new_char = (char) ((int) ((Char + shift - 'a') % 26) + 'a');
				output += new_char;
			} else if (Character.isUpperCase(Char)) {
				char new_char = (char) ((int) ((Char + shift - 'A') % 26) + 'A');
				output += new_char;
			} else {
				output += Char;
			}
		}
		return output;
	}
	
	static String decrypter(int shift, String text) {
		String output = "";
		for (int i = 0; i < text.length(); i++) {
			char Char = text.charAt(i);
			if (Character.isLowerCase(Char)) {
				char new_char = (char) ((int) ((Char - shift - 'a') % 26) + 'a');
				output += new_char;
			} else if (Character.isUpperCase(Char)) {
				char new_char = (char) ((int) ((Char - shift - 'A') % 26) + 'A');
				output += new_char;
			} else {
				output += Char;
			}
		}
		return output;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String to Encrypt: ");
		String text = sc.nextLine();
		System.out.print("Enter a shift value: ");
		int shift = sc.nextInt();
		System.out.println("Encrypted Text: "+encrypter(shift, text));
		System.out.println("Decrypted Text: "+decrypter(shift, encrypter(shift, text)));
		sc.close();
	}

}