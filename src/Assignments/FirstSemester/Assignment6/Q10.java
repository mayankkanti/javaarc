package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class Q10 {
	public static double area(double side) {
		// area for square
		double area = side * side;
		return area;
	}
	public static double area(double height, double base) {
		// area for triangle
		double area = 0.5*base*height;
		return area;
	}
	public static double area(double radius, boolean isCircle) {
		// area for circle
		double area = Math.PI*Math.pow(radius, 2);
		return area;
	}
	public static double area(double length, double width, boolean isRectangle) {
		// area for rectangle
		double area = 2*(length+width);
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Area Calculator Options:");
		System.out.println("1 - Square");
		System.out.println("2 - Rectangle");
		System.out.println("3 - Triangle");
		System.out.println("4 - Circle");
		System.out.print("Enter Choice:");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Area of a Square Calculator");
			System.out.print("Enter the length of side of sqaure: ");
			double side = sc.nextDouble();
			System.out.println("Area of the square is "+area(side));
			break;
		case 2:
			System.out.println("Area of a Rectangle Calculator");
			System.out.print("Enter the length of rectangle: ");
			double length = sc.nextDouble();
			System.out.print("Enter the width of rectangle: ");
			double width = sc.nextDouble();
			System.out.println("Area of the rectangle is "+area(length, width, true));
			break;
		case 3:
			System.out.println("Area of a Triangle Calculator");
			System.out.print("Enter the height of triangle: ");
			double height = sc.nextDouble();
			System.out.print("Enter the base of triangle: ");
			double base = sc.nextDouble();
			System.out.println("Area of the triangle is "+area(height, base));
			break;
		case 4:
			System.out.println("Area of a Circle Calculator");
			System.out.print("Enter the radius of cicle: ");
			double radius = sc.nextDouble();
			System.out.println("Area of the circle is "+area(radius, true));
			break;
		default:
			System.out.println("WRONG INPUT");
		}
		sc.close();
	}

}

