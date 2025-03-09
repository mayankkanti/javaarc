package Assignments.FirstSemester.Assignment2;
import java.util.Scanner;
public class HAQ3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("Enter the coordinates of the triangle (x1 y1 x2 y2 x3 y3): ");
        
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        System.out.println("Coordinates entered: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + "), (" + x3 + ", " + y3 + ")");
		
		// Calculating side.
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        
        System.out.printf("The area of the triangle is " + area);
        input.close();

	}

}
