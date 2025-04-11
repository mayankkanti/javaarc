package Assignments.SecondSemester.Assignment2;

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
        // 5 books
        Book b1 = new Book(101, 2, 500.0);
        Book b2 = new Book(102, 3, 300.0);
        Book b3 = new Book(103, 1, 700.0);
        Book b4 = new Book(104, 4, 200.0);
        Book b5 = new Book(105, 5, 100.0);

        // Display details of each book
        System.out.println("Book 1 Details: ");
        b1.displayDetails();
        System.out.println("Total Price: " + b1.total());
        System.out.println("Book 2 Details: ");
        b2.displayDetails();
        System.out.println("Total Price: " + b2.total());
        System.out.println("Book 3 Details: ");
        b3.displayDetails();
        System.out.println("Total Price: " + b3.total());
        System.out.println("Book 4 Details: ");
        b4.displayDetails();
        System.out.println("Total Price: " + b4.total());
        System.out.println("Book 5 Details: ");
        b5.displayDetails();
        System.out.println("Total Price: " + b5.total());


        // Display total price of all books
        System.out.println("Total Price of all books: " + Book.total_price);
    }
}
