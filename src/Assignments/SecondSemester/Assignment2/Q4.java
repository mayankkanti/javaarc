package Assignments.SecondSemester.Assignment2;

class Deposit{
    long principal;
    double rate;
    int time;
    double total_amount;

    Deposit(long principal, double rate, int time){
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        total_amount = calculateTotalAmount();
    }

    Deposit(){
        principal = 1000;
        rate = 5.0;
        time = 1;
        total_amount = calculateTotalAmount();
    }

    Deposit(long principal, double rate){
        this.principal = principal;
        this.rate = rate;
        this.time = 1;
        total_amount = calculateTotalAmount();
    }

    Deposit(long principal, int time){
        this.principal = principal;
        this.rate = 5.0;
        this.time = time;
        total_amount = calculateTotalAmount();
    }

    void displayDetails(){
        System.out.println("Principal: " + principal);
        System.out.println("Rate: " + rate);
        System.out.println("Time: " + time);
        System.out.println("Total Amount: " + total_amount);
    }

    double calculateTotalAmount(){
        total_amount = principal + ((principal * rate * time) / 100);
        return total_amount;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Deposit d1 = new Deposit(1000, 5.0, 2);
        d1.displayDetails();

        Deposit d2 = new Deposit(2000, 3.5);
        d2.displayDetails();

        Deposit d3 = new Deposit(1500, 2);
        d3.displayDetails();

        Deposit d4 = new Deposit();
        d4.displayDetails();
    }
}
