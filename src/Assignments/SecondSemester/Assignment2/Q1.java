package Assignments.SecondSemester.Assignment2;


import java.util.Scanner;
class car {
    String model;
    int year;
    void setDetails(String model, int year) {
    	
    	this.model = model;
    	this.year = year;
    }
    void displayDetails() {
    	System.out.println(model + " " + year);
    }
    
}

public class Q1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Model and Year: ");
    	car car2 = new car();
    	car2.model = "Mercedes";
    	car2.year = 2025;
    
        car car1 = new car();
        String m = sc.next();
        int y = sc.nextInt();
        car1.setDetails(m,y);
        car1.displayDetails();
        car2.displayDetails();
        
        if (car1.year > car2.year) System.out.println(car1.model + "is newer." );
        else System.out.println(car2.model + " is newer." );
        
        sc.close();
    }
}
