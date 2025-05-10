package Assignments.SecondSemester.Assignment2;

import java.util.Scanner;

class Book{
    int bookID, quantity;
    double price;
    static double total_price;

    Book(int bookID, int quantity, double price){
        this.bookID = bookID;
        this.quantity = quantity;
        this.price = price;
        total_price += total();
    }

    void displayDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    double total(){
        return price * quantity;
    }
}


public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Object Arr
        Book[] books = new Book[5];

        for(int i = 0; i < books.length; i++) {
            // Create a new book object with sample data
            System.out.print("Enter Quantity & Price: ");
            int quantity = sc.nextInt();
            double price = sc.nextDouble();
            books[i] = new Book(i + 1,quantity, price);
            books[i].displayDetails();
        }

        // Display total price of all books
        System.out.println("Total Price of all books: " + Book.total_price);
        sc.close();
    }
}
