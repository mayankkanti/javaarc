package Assignments.SecondSemester.Assignment6;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Q1PART2 {
    public static Scanner input = new Scanner(System.in);
    public static Node push(Node top) {
        System.out.print("Enter data to push: ");
        int data = input.nextInt();
        Node newNode = new Node(data);
        if (top == null){
            top = newNode;
            return top;
        }
        Node current = top;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        System.out.printf("%d was pushed into the stack. \n", data);
        return top;
    }

    public static Node pop(Node top) {
        if (top == null){
            System.out.println("The stack is empty.");
            return top;
        }
        System.out.printf("%d was popped from the stack. \n", top.data);
        top = top.next;

        return top;
    }

    public static void display(Node top) {
        if (top == null){
            System.out.println("The stack is empty.");
            return;
        }

        Node current = top;
        while (current != null){
            if (current.next != null){
                System.out.printf("%d > ", current.data);
            } else {
                System.out.printf("%d \n", current.data);
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node top = null;
        boolean running = false;

        while (running) {
            System.out.println("**** MENU ****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                    sc.close();
                    running = false;
                    break;
                case 1:
                    top = push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
