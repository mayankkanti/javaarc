package Assignments.SecondSemester.Assignment5;

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class Q1 {

    public static Node create(Node start, Node end) {

        return start;
    }

    public static Node insBeg(Node start, Node end) {
        
        return start;
    }

    public static Node insEnd(Node start, Node end) {
        
        return start;
    }

    public static Node insAny(Node start, Node end) {
        
        return start;
    }

    public static Node delBeg(Node start, Node end) {
        
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        
        return start;
    }

    public static Node delAny(Node start, Node end) {
        
        return start;
    }

    public static void search(Node start) {
        
    }

    public static void display(Node start, Node end) {
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node start = null, end = null;

        while (true) {
            System.out.println("**** MENU *****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at Beginning");
            System.out.println("4: Insert at End");
            System.out.println("5: Insert at Any Position");
            System.out.println("6: Delete from Beginning");
            System.out.println("7: Delete from End");
            System.out.println("8: Delete from Any Position");
            System.out.println("9: Search and Update");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);
                    sc.close();
                case 1:
                    end = create(start, end);
                    break;
                case 2:
                    display(start, end);
                    break;
                case 3:
                    start = insBeg(start, end);
                    break;
                case 4:
                    start = insEnd(start, end);
                    break;
                case 5:
                    start = insAny(start, end);
                    break;
                case 6:
                    start = delBeg(start, end);
                    break;
                case 7:
                    end = delEnd(start, end);
                    break;
                case 8:
                    start = delAny(start, end);
                    break;
                case 9:
                    search(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
