package Assignments.SecondSemester.Assignment4;

class Node{
    protected int regd_No;
    protected float mark;
    protected Node next;

    Node (int regd_No, float mark){
        this.regd_No = regd_No;
        this.mark = mark;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    void insertAtBeginning(int regd_No, float mark){
        Node newNode = new Node(regd_No, mark);
        if (head == null){
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }
    void insertAtEnd(int regd_No, float mark) {
        Node newNode = new Node(regd_No, mark);
        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void insertAtIndex(int index, int regd_No, float mark){
        Node newNode = new Node(regd_No, mark);
        if (index == 0){
            insertAtBeginning(regd_No, mark);
            return;
        }
        Node current = head;
        Node previous = null;
        for(int i = 0; i < index; i++){
            if (current == null){
                System.out.println("Index out of bounds.");
                return;
            }

            previous = current;
            current = current.next;
        }

        previous.next = newNode;
        newNode.next = current;

    }
}

public class Q1 {
    public static void main(String[] args) {
        
    }
}
