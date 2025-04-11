package Assignments.SecondSemester.Assignment2;

class Complex{
    double real, img;
    void setDetails(double real, double img) {
        this.real = real;
        this.img = img;
    }

    void displayDetails() {
        System.out.println(img+"i+"+real);
    }

    public Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.img = this.img + c.img;
        return result;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        c1.setDetails(2.5, 3.5);
        c2.setDetails(4.5, 5.5);

        System.out.println("Complex Number 1: ");
        c1.displayDetails();
        System.out.println("Complex Number 2: ");
        c2.displayDetails();

        c3 = c1.add(c2);
        System.out.println("Sum of Complex Numbers: ");
        c3.displayDetails();
    }
}
