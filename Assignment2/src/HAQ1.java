import java.util.Scanner;
public class HAQ1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int years, days, minutes;
		System.out.println("Enter the number of minutes (int): ");
		minutes = input.nextInt();
		// Assuming 1 year == 365 days == 525600 minutes.
		years = (int) minutes / 525600;
		days = (int) (minutes % 525600) / 1440;
		System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days.");
		input.close();
	}
}
