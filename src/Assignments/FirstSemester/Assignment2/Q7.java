//Using Loops but not explained yet.
//public class Q7 {
//
//    public static void main(String[] args) {
//        System.out.println("a\tb\tpow(a, b)");
//        for (int a = 1, b = 2; a <= 5; a++, b++) {
//            int power = (int) Math.pow(a, b);
//            System.out.println(a + "\t" + b + "\t" + power);
//        }
//    }
//}

package Assignments.FirstSemester.Assignment2;
import java.util.Scanner;
public class Q7{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("a\tb\tpow(a, b)");
		System.out.println(1 + "\t" + 2 + "\t" + (int) Math.pow(1, 2));
		System.out.println(2 + "\t" + 3 + "\t" + (int) Math.pow(2, 3));
		System.out.println(3 + "\t" + 4 + "\t" + (int) Math.pow(3, 4));
		System.out.println(4 + "\t" + 5 + "\t" + (int) Math.pow(4, 5));
		System.out.println(5 + "\t" + 6 + "\t" + (int) Math.pow(5, 6));
		input.close();
	}
}