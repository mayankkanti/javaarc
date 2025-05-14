package Assignments.SecondSemester.Assignment2;

import java.util.Scanner;

class CarQ1{
	String model;
	int year;
	
	void setDetails(String model, int year){
		this.model = model;
		this.year = year;
	}

	void displayDetails() {
		System.out.println("Car Model: "+model);
		System.out.println("Year: "+year);
	}
}

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CarQ1 car1 = new CarQ1();
		CarQ1 car2= new CarQ1();

		car1.model = "Toyota";
		car1.year = 2020;

		System.out.print("Enter Car Model: ");
		String model = sc.next();
		System.out.print("Enter Car Year: ");
		int year = sc.nextInt();

		car2.setDetails(model, year);

		System.out.println("Car 1 Details: ");
		car1.displayDetails();
		System.out.println("Car 2 Details: ");
		car2.displayDetails();

		if(car1.year > car2.year) {
			System.out.println("Car 1 is newer than Car 2.");
		} else if(car1.year < car2.year) {
			System.out.println("Car 2 is newer than Car 1.");
		} else {
			System.out.println("Both cars are of the same year.");
		}

		sc.close();
	}

}
