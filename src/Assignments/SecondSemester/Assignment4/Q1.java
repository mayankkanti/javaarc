package Assignments.SecondSemester.Assignment4;

import java.util.Scanner;

class Node {
    protected int regd_no;
    protected float mark;
    protected Node next;
}
                 
public class Q1 {
    private static Scanner sc = new Scanner(System.in);

    public static void create(Node start) {
        System.out.print("Enter the number of Students: ");
        int n = sc.nextInt();
        if (n<=0){
            System.out.println("Input can't be less than 1");
            return;
        }

        System.out.print("Enter student 1 details (Redg No and Marks): ");
        start.regd_no = sc.nextInt();
        start.mark = sc.nextFloat();
        start.next = null;

        Node current = start;
        for(int i=2; i<=n; i++){
            Node newNode = new Node();
            System.out.print("Enter student "+i+" details (Redg No and Marks): ");
            newNode.regd_no = sc.nextInt();
            newNode.mark = sc.nextFloat();
            newNode.next = null;
            current.next = newNode;
            current = newNode;
        }

    }

    public static void display(Node start) {
        if (start == null){
            System.out.println("The list is currently empty. Nothing to display here.");
            return;
        }
        Node current = start;
        System.out.println("Current Linked List: ");
        while(current.next != null){
            System.out.printf("(%d, %.2f) >", current.regd_no, current.mark);
            current = current.next;
        }
        System.out.printf("(%d, %.2f) > null \n\n", current.regd_no, current.mark);
    }

    public static Node InsBeg(Node start) {
        Node newNode = new Node();
        System.out.println("Enter student details (Redg No and Marks): ");
        newNode.regd_no = sc.nextInt();
        newNode.mark = sc.nextFloat();
        if (start == null){
            start = newNode;
            return start;
        }
        newNode.next = start;
        start = newNode;
        System.out.println("Node inserted at the beginning.");
        return start;
    }

    public static Node InsEnd(Node start) {
        if (start == null){
            start = InsBeg(start);
            return start;
        }
        Node newNode = new Node();
        System.out.print("Enter student details (Redg No and Marks): ");
        newNode.regd_no = sc.nextInt();
        newNode.mark = sc.nextFloat();
        
        Node current = start;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        System.out.println("Node inserted at the end");
        return start;
    }

    public static Node InsAny(Node start) {
        if (start == null){
            System.out.println("The list is currently empty.");
            return start;
        }
        System.out.print("Enter the index you want the node to be inserted at: ");
        int index = sc.nextInt();
        if (index == 0){
            start = InsBeg(start);
            return start;
        }
        Node current = start;
        Node previous = null;
        for(int i=0; i<index; i++){
            if (current == null){
                System.out.println("Index Out Of Bounds.");
                return start;
            }
            previous = current;
            current = current.next;
        }
        if (current.next == null){
            start = InsEnd(start);
            return start;
        }
        Node newNode = new Node();
        System.out.print("Enter student details (Redg No and Marks): ");
        newNode.regd_no = sc.nextInt();
        newNode.mark = sc.nextFloat();
        
        previous.next = newNode;
        newNode.next = current;

        return start;
    }

    public static Node DelBeg(Node start) {
        if (start == null){
            System.out.println("The list is currently empty. Nothing to delete here.");
            return start;
        }
        start = start.next;
        System.out.println("Node deleted at the beginning.");
        return start;
    }

    public static Node DelEnd(Node start) {
        if (start == null){
            System.out.println("The list is currently empty. Nothing to delete here.");
            return start;
        }
        Node current = start;
        Node previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        System.out.println("Node deleted at the end.");
        return start;
    }

    public static Node DelAny(Node start) {
        if (start == null){
            System.out.println("The list is currently empty. Nothing to delete here.");
            return start;
        }
        System.out.print("Enter the index to delete: ");
        int index = sc.nextInt();
        
        if (index == 0){
            start = DelBeg(start);
            return start;
        }
        Node current = start;
        Node previous = null;

        for(int i=0; i<index; i++){
            if (current == null){
                System.out.println("Index Out Of Bounds.");
                return start;
            }
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        return start;
    }

    public static Node DelByRegd(Node start) {
        if (start == null){
            System.out.println("The list is currently empty. Nothing to delete here.");
            return start;
        }
        System.out.println("Enter the regd no to delete the node: ");
        int targetval = sc.nextInt();

        Node current = start;
        Node previous = null;
        boolean found = false;
        int index = 0;

        while(current!=null){
            if (current.regd_no == targetval){
                if (previous == null){
                    start = current.next;
                } else{
                    previous.next = current.next;
                }
                found = true;
                System.out.printf("Data %s deleted at index %d \n", targetval, index);
            }
            previous = current;
            current = current.next;
            index++;
        }
        if (!found){
            System.out.println("Data not found.");
        }

        return start;
    }

    public static void search(Node start) {
        if (start == null){
            System.out.println("The list is currently empty. Nothing to search here.");
            return;
        }
        System.out.println("Enter the regd no of the Student: ");
        int target = sc.nextInt();

        boolean found = false;
        Node current = start;
        int index = 0;

        while(current != null){
            if (current.regd_no == target){
                System.out.printf("Target found at index %d \n", index);
                System.out.println("Enter the marks to update: ");
                float mark = sc.nextFloat();
                System.out.printf("Marks updated from %.2f to %.2f \n", current.mark, mark);
                current.mark = mark;
            }
            current = current.next;
            index++; 
        }
        if (!found){
            System.out.println("Target not found! Node with that registration number does not exist.");
        }
    }

    public static int count(Node start) {
        if (start == null){
            System.out.println("The list is currently empty.");
            return -1;
        }
        int count = 0;
        Node current = start;
        while(current!=null){
            current = current.next;
            count++;
        }
        return count;
    }

    public static Node reverse(Node start) {
        if (start == null){
            System.out.println("The List is Empty.");
            return start;
        }

        if (start.next == null){
            System.out.println("There's only one Node in the list.");
            return start;
        }

        Node previous = null;
        Node current = start; 
        while (current != null){
            Node next = current.next;
            current.next = previous;  
            previous = current;
            current = next; 
        }
        start = previous;
        return start;
    }

    public static void sort(Node start){
        if (start == null){
            System.out.println("The List is Empty.");
            return;
        }

        boolean swapped;
        for (Node current = start; current != null; current = current.next) {
            swapped = false;
            for (Node current2 = start; current2.next!= null; current2 = current2.next) {
                if (current2.mark > current2.next.mark) {
                    float temp = current2.mark;
                    current2.mark = current2.next.mark;
                    current2.next.mark = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        Node start = null;
        Scanner c = new Scanner(System.in);
        int choice;
        
        while(true) {
            System.out.println("\n*****MENU*****");
            System.out.println("0: Exit");
            System.out.println("1: Creation");
            System.out.println("2: Display");
            System.out.println("3: Insert at beginning");
            System.out.println("4: Insert at end");
            System.out.println("5: Insert at any position");
            System.out.println("6: Delete from beginning");
            System.out.println("7: Delete from end");
            System.out.println("8: Delete from any position");
            System.out.println("9: Delete by registration number");
            System.out.println("10: Search and update mark");
            System.out.println("11: Sort by mark (descending)");
            System.out.println("12: Count nodes");
            System.out.println("13: Reverse list");
            System.out.println("Enter your choice:");
            
            choice = sc.nextInt();
            
            switch(choice) {
                case 0:
                    c.close();
                    System.exit(0);
                case 1:
                    start = new Node();
                    create(start);
                    break;
                case 2:
                    display(start);
                    break;
                case 3:
                    start = InsBeg(start);
                    break;
                case 4:
                    start = InsEnd(start);
                    break;
                case 5:
                    start = InsAny(start);
                    break;
                case 6:
                    start = DelBeg(start);
                    break;
                case 7:
                    start = DelEnd(start);
                    break;
                case 8:
                    start = DelAny(start);
                    break;
                case 9:
                    start = DelByRegd(start);
                    break;
                case 10:
                    search(start);
                    break;
                case 11:
                    sort(start);
                    break;
                case 12:
                    System.out.println("Number of nodes: " + count(start));
                    break;
                case 13:
                    start = reverse(start);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
        
    }
}