package Assignments.SecondSemester.Assignment2;

class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class CarQ6 extends Vehicle {
    int CarID;
    double price;
    CarQ6(String model, int year, int CarID, double price) {
        super(model, year);
        this.CarID = CarID;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Car ID: " + CarID);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }
}

public class Q6 {
    public static void main(String[] args) {
        CarQ6 obj1Car = new CarQ6("Toyota", 2020, 101, 20000.0);
        obj1Car.displayDetails();
    }
    
}
