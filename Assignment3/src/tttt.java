import java.util.Scanner;
public class tttt {

	public static void main(String[] args) {
		int a, b, c, largest, secondlargest;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of a, b, c: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		if (a>b & a>c) {
			largest = a;
			secondlargest = (b>c)?b:c;
		}else if (b>a & b>c) {
			largest = b;
			secondlargest = (a>c)?a:c;
		}else {
			largest = c;
			secondlargest = (b>a)?b:c;
		}
		System.out.println("Largest Number: "+largest);
		System.out.println("2nd Largest Number: "+secondlargest);
	}

}
