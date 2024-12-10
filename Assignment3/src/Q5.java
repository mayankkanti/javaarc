 import java.util.Scanner;
public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input the year: ");
		int userinput = input.nextInt();
		if (userinput % 4 == 0 && userinput % 100 != 0 || userinput % 400 == 0) {
			System.out.println(userinput+" is a leap year: true");
		}
		else {
			System.out.println(userinput+" is a leap year: false");
		}
	}

}

/*
 * Input the year: 
 * 2012 
 * 2012 is a leap year: true
 */