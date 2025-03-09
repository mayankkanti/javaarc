package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class Q5 {
	public static double area(int n, double side) {
		double area = ((n*Math.pow(side, 2))/4*Math.tan((Math.PI/n)));
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int nsides = sc.nextInt();
		System.out.print("Enter the length of each side: ");
		double lside = sc.nextDouble();
		System.out.println("The area of a polygon of "+nsides+" with length "+lside+" is "+area(nsides, lside));
		sc.close();
	}

}

