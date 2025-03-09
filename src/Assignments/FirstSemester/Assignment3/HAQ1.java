import java.util.Scanner;

public class HAQ1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = -1, min = 3; // Limits are not included.
		int randomNum = (int) (Math.random() * (max - min + 1) + min);

		// Taking 0 - scissor, 1 - rock, 2 - paper

		System.out.print("scissor (0), rock (1), paper (2): ");
		int userinput = input.nextInt();

		String computer = "The computer is " + (randomNum == 0 ? "Scissor. " : randomNum == 1 ? "Rock. " : "Paper. ");
		String user = "You are " + (userinput == 0 ? "Scissor" : userinput == 1 ? "Rock" : "Paper");

		if (userinput == randomNum) {
			String fstring = computer + user + " too. It is a draw";
			System.out.println(fstring);
		} else if ((userinput == 0 && randomNum == 2) || (userinput == 1 && randomNum == 0)
				|| (userinput == 2 && randomNum == 1)) {
			System.out.println(computer + user + ". You won.");
		} else {
			System.out.println(computer + user + ". You lost.");
		}

	}
}
