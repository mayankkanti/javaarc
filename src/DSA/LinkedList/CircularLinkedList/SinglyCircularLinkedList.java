package DSA.LinkedList.CircularLinkedList;

import java.util.Random;

class SingleNode {
    String data;
    SingleNode next;

    SingleNode(String data){
        this.data = data;
        this.next = null;
    }
}

class SCL{
    SingleNode head = null, tail = null;

    void insertAtBeginning(String data){
        SingleNode newNode = new SingleNode(data);
        if (head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = newNode;
    }

    void insertAtEnd(String data){
        SingleNode newNode = new SingleNode(data);
        if (head == null){
            insertAtBeginning(data);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        tail.next = head;

    }

    void insertAtIndex(int index, String data){
        SingleNode newNode = new SingleNode(data);
        // accounts for case 1
        if (index == 0){
            insertAtBeginning(data);
            return;
        }

        SingleNode current = head;
        SingleNode previous = tail;
        int count = 0;
        while(count != index && current.next!=head){
            count++;
            previous = current;
            current = current.next;
        }
        if (count == index){
            // case 2
            if (current.next == head){
                insertAtEnd(data);
                return;
            }
            // case 3
            previous.next = newNode;
            newNode.next = current;
        } else{
            // case 4
            System.out.println("Index Out Of Bounds.");
        }

    }
    // gpt'ed for validating lists
    boolean validateList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return true; // An empty list is considered valid
        }

        SingleNode current = head;
        int nodeCount = 0;

        // Traverse the list and ensure it loops back to the head
        while (current.next != null) {
            nodeCount++;
            current = current.next;

            // If we loop back to the head, the list is valid
            if (current == head) {
                System.out.println("The circular linked list is valid. Node count: " + nodeCount);
                return true;
            }

            // Safety check to prevent infinite loops in case of corruption
            if (nodeCount > 10000) { // Arbitrary large number to detect corruption
                System.out.println("The list appears to be corrupted (infinite loop detected).");
                return false;
            }
        }

        // If we exit the loop without returning, the list is invalid
        System.out.println("The list is not circular (last node does not point to the head).");
        return false;
    }

    void displayList() {
        SingleNode current = head;
        while(current.next != head){
            System.out.print(current.data + ">");
            current = current.next;
        }
        // printing the last node
        System.out.print(current.data + "\n");
    }

}

public class SinglyCircularLinkedList {
    static void insertOperations(SCL list, int OperationDelay) throws InterruptedException{
        System.out.println("Inserting 10 at beginning. \n");
        Thread.sleep(OperationDelay);
        list.insertAtBeginning("10");
        list.displayList();

        System.out.println("Inserting 22 at end. \n");
        Thread.sleep(OperationDelay);
        list.insertAtEnd("22");
        list.displayList();

        System.out.println("Inserting 69 at index 6. \n");
        Thread.sleep(OperationDelay);
        list.insertAtIndex(6, "69");
        list.displayList();
    }
    public static void main(String[] args) {
        Random random = new Random();
        int OperationDelay = 2500;

        try {
            SCL list = new SCL();

            System.out.println("Generating a Random Linked List. \n");
            Thread.sleep(OperationDelay);
            for (int i = 0; i < 5; i++){
                list.insertAtEnd(Integer.toString(random.nextInt(10)));
            }
            list.displayList();
            list.validateList();

            insertOperations(list, OperationDelay);

            list.validateList();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
