package Assignments.FirstSemester.Assignment4;
import java.util.Scanner;

public class Q9 {
	static void bystring(int input) {
		String userinput = Integer.toString(input);
		String output = "";
		for (int i = 0; i < userinput.length(); i++) {
			if (userinput.charAt(i) != '0') {
				output = output + userinput.charAt(i);
			}
		}
		System.out.println("Original Number: "+userinput);
		System.out.println("New Number: "+output);
	}

	static void withoutstring(int input) {
		int userinput = input;
		int num = userinput;
		int index = 0;
		int remainder  = 0, outputnum = 0;
		while (num != 0) {
			remainder = num % 10;
			num = num / 10;
			if (remainder != 0) {
				outputnum += (int)(remainder *Math.pow(10,index));
				index++;
			}
		}
		System.out.println("Original Number: "+userinput);
		System.out.println("New Number: "+outputnum);
	}

	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int intinput = input.nextInt();
		bystring(intinput);
		withoutstring(intinput);
		input.close();
	}
}
