//*  No changes to this one but Node end is basically useless here (im not sure why it was even added to the question.)

package Assignments.SecondSemester.Assignment5;

import java.util.Scanner;

//! to be removed after completion
import java.util.Random;


class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
    protected Node prev;
}

public class Q1_ORIGINAL {
    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    public static Node create(Node start, Node end) {
        boolean listExists = start != null;
        if (listExists){
            System.out.print("The list already exists. Do you want to redo creation? (y/n)");
            String ch = input.next();
            if (ch.equals("n")) return start; 
        }

        System.out.print("Enter the number of Nodes: ");
        int count = input.nextInt();
        Node previous = null;

        for (int i = 1; i <= count; i++) {
            Node newNode = new Node();
            System.out.printf("Enter Regd And Marks (Node %d): ", i);
            newNode.regd_no = input.nextInt();
            newNode.mark = input.nextFloat();
            newNode.prev = previous;
            newNode.next = null;
            if (previous != null) {
                previous.next = newNode;
            } else {
                start = newNode;
            }
            previous = newNode;
        }
        return start;
    }

    public static Node insBeg(Node start, Node end) {
        Node newNode = new Node();
        System.out.print("Enter Regd And Marks: ");
        newNode.regd_no = input.nextInt();
        newNode.mark = input.nextFloat();
        if (start == null){
            start = newNode;
            return start;
        }
        start.prev = newNode;
        newNode.next = start;
        start = newNode;
        return start;
    }

    public static Node insEnd(Node start, Node end) {
        Node newNode = new Node();
        System.out.print("Enter Regd And Marks: ");
        newNode.regd_no = input.nextInt();
        newNode.mark = input.nextFloat();
        if (start == null){
            start = newNode;
            return start;
        }
        Node current = start;
        while(current.next!= null){
            current=current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        return start;
    }

    public static Node insAny(Node start, Node end) {
        Node newNode = new Node();
        System.out.print("Enter the index you want to insert: ");
        int index = input.nextInt();
        System.out.print("Enter Regd And Marks: ");
        newNode.regd_no = input.nextInt();
        newNode.mark = input.nextFloat();

        Node current = start;
        Node previous = null;

        if (index == 0){
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
            return start;
        }

        for(int i=0; i<index; i++){
            if (current == null){
                System.out.println("IndexOutOfBounds");
                return start;
            }
            previous = current;
            current = current.next;
        }

        if (current == null){
            previous.next = newNode;
            newNode.prev = previous;
            return start;
        }

        previous.next = newNode;
        newNode.prev = previous;

        newNode.next = current;
        current.prev = newNode;
        
        return start;
    }

    public static Node delBeg(Node start, Node end) {
        if (start == null){
            System.out.println("The list is empty.");
            return start;
        }
        start = start.next;
        start.prev = null;
        return start;
    }

    public static Node delEnd(Node start, Node end) {
        if (start == null){
            System.out.println("The list is empty.");
            return start;
        }

        Node current = start;
        Node previous = null;

        while(current.next != null){
            previous = current;
            current=current.next;
        }
        if (previous == null){
            start = null;
            return start;
        }
        previous.next = null;

        return start;
    }

    public static Node delAny(Node start, Node end) {
        if (start == null){
            System.out.println("The list is empty.");
            return start;
        }
        System.out.print("Enter the index of the node to delete: ");
        int index = input.nextInt();
        if (index == 0){
            start = start.next;
            start.prev = null;
            return start;
        }
        Node current = start;
        Node previous = null;
        Node next = current.next;

        for(int i=0; i<index; i++){
            if(current == null){
                System.out.println("IndexOutOfBounds");
                return start;
            }
            previous = current;
            current = current.next;
            next = current.next;
        }

        if (next == null){
            previous.next = null;
            return start;
        }

        previous.next = next;
        next.prev = previous; 

        return start;
    }

    public static void search(Node start) {
        if (start == null){
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("Enter the regd no: ");
        int target = input.nextInt();
        boolean found = false;

        Node current = start;
        while(current != null){
            if (current.regd_no == target){
                found = true;
            }
            current = current.next;
        }

        if (!found){
            System.out.print("Regd no not found.");
        }
    }

    public static void display(Node start, Node end) {
        if (start == null){
            System.out.println("The list is empty.");
            return;
        }
        
        Node current = start;
        while(current != null){
            System.out.print(current.next == null? "("+current.regd_no+" "+current.mark+") \n\n" : "("+current.regd_no+" "+current.mark+") >" );
            current = current.next;
        }
    }

    //* gpt'ed for validating list
    public static boolean validateList(Node start) {
        if (start == null) {
            System.out.println("List is empty. Valid.");
            return true;
        }
        Node slow = start, fast = start;
        Node prev = null;
        int index = 0;
        while (slow != null) {
            // Check prev pointer
            if (slow.prev != prev) {
                System.out.println("Invalid prev pointer at node index " + index);
                return false;
            }
            // Cycle detection (Floyd's algorithm)
            if (fast != null && fast.next != null) {
                fast = fast.next.next;
                if (fast == slow) {
                    System.out.println("Cycle detected in the list.");
                    return false;
                }
            } else {
                fast = null;
            }
            prev = slow;
            slow = slow.next;
            index++;
        }
        System.out.println("List is valid.");
        return true;
    }

    //*  Hidden method for generating random Nodes :0

    public static Node genRandom(Node start){
        System.out.print("Enter number of nodes: ");
        int count = input.nextInt();
        Node previous = null;

        for (int i = 1; i <= count; i++) {
            Node newNode = new Node();
            newNode.regd_no = i;
            newNode.mark = random.nextInt(100);
            newNode.prev = previous;
            newNode.next = null;
            if (previous != null) {
                previous.next = newNode;
            } else {
                start = newNode;
            }
            previous = newNode;
        }
        return start;
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
                case -1:
                    start = genRandom(start);
                    break;
                case 0:
                    System.exit(0);
                    sc.close();
                case 1:
                    start = create(start, end);
                    break;
                case 2:
                    display(start, end);
                    System.out.println("List validation result: "+validateList(start));
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
                    start = delEnd(start, end);
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
