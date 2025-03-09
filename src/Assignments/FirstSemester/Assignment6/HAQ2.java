package Assignments.FirstSemester.Assignment6;
import java.util.Scanner;
public class HAQ2 {
	public static double volume(float side) {
		double volume = Math.pow(side,3);
		return volume;
	}
	public static double volume(float radius, boolean isCircle) {
		double volume = (4.0/3.0)*(Math.PI)*(Math.pow(radius, 3));
		return volume;
	}
	public static double volume(float length, float breadth, float height) {
		double volume = length * breadth * height;
		return volume;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Volume Calculator");
			System.out.println("1 - cube");
			System.out.println("2 - cuboid");
			System.out.println("3 - sphere");
			System.out.println("4 - exit program");
			System.out.print("Enter your choice: ");
			int user = sc.nextInt();
			while(!(user>0 && user<5)) {
				System.out.println("Wrong Input.");
				System.out.print("Enter your choice: ");
				user = sc.nextInt();
			}
			if (user == 1) {
				System.out.print("Enter the length of side of the cube: ");
				float side = sc.nextFloat();
				System.out.println("The Volume of the cube is "+volume(side));
			} else if(user == 2) {
				System.out.print("Enter the length of the cuboid: ");
				float length = sc.nextFloat();
				System.out.print("Enter the breadth of the cuboid: ");
				float breadth = sc.nextFloat();
				System.out.print("Enter the height of the cuboid: ");
				float height = sc.nextFloat();
				System.out.println("The volume of the cuboid is "+volume(length, breadth, height));
			} else if(user == 3) {
				System.out.print("Enter the radius of the sphere: ");
				float radius = sc.nextFloat();
				System.out.println("The volume of the sphere is "+volume(radius, true));
				
			} else {
				break;
			}
		}

	}

}

