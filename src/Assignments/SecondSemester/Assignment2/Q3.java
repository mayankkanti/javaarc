package Assignments.SecondSemester.Assignment2;


class Book {
	int bookID;
	double price;
	int quantity;
	static double totalAmount;
	
	Book (int id, double price, int quantity) {
		this.bookID = id;
		this.price = price;
		this.quantity = quantity;
		totalAmount += totalprice();
	}
	
	void displayDetails() {
		System.out.println("BookID: "+ bookID);
		System.out.println("Price: "+ price);
		System.out.println("Quantity: "+ quantity);
	}
	
	double totalprice() {
		double total = price * quantity;
		return total;
	}
	
}

public class Q3 {
	public static void main(String[] args) {
		Book book1 = new Book(01, 540.20, 20);
		Book book2 = new Book(02, 640.60, 50);
		System.out.println("Book 1 \n");
		book1.displayDetails();
		System.out.println("\nBook 2 \n");
		book2.displayDetails();
		
		System.out.println("Total Amt: "+ Book.totalAmount);
		

	}
}
