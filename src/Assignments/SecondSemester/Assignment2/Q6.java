package Assignments.SecondSemester.Assignment2;

class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

class car extends Vehicle {
    int CarID;
    double price;
    car(String model, int year, int CarID, double price) {
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
        car obj1Car = new car("Toyota", 2020, 101, 20000.0);
        obj1Car.displayDetails();
    }
    
}
