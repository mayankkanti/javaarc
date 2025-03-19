package Assignments.SecondSemester.Assignment2;

import java.util.Scanner;
class Complex{
	double real;
	double img;
	
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter real part: ");
		this.real = sc.nextDouble();
		System.out.print("Enter img part: ");
		this.img = sc.nextDouble();
		sc.close();
	}
	
	void display() {
		System.out.println(real + "+" + img+"i");;
	}
	
	public Complex add (Complex c1, Complex c2) {
		Complex c = new Complex();
		c.real = c1.real + c2.real;
		c.img = c1.img + c2.img;
		return c;	
	}
	
}


public class Q2 {

	public static void main(String[] args) {
		
		Complex c1 = new Complex();
		
		c1.setData();
		Complex c2 = new Complex();
		c2.setData();
		System.out.println("Complex No1:");
		c1.display();
		System.out.println("Complex No2:");
		c2.display();
		
		System.out.println("Added Complex: ");
		Complex c = c1.add(c1, c2);
		c.display();

	}

}
