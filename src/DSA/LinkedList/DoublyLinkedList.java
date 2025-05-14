package DSA.LinkedList;

import java.lang.Thread;
import java.util.Random;

class NodeDouble{
    String data;
    NodeDouble next, prev;

    NodeDouble(String data){
        this.data = data;
    }
}

class DoublyList{
    NodeDouble head = null;

    void insertAtBeginning(String data){
        NodeDouble newNode = new NodeDouble(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insertAtEnd(String data){
        NodeDouble newNode = new NodeDouble(data);
        if (head == null){
            head = newNode;
            return;
        }

        NodeDouble current = head;

        while(current.next!= null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    void insertAtIndex(int index, String data){
        NodeDouble newNode = new NodeDouble(data);
        if (index == 0){
            insertAtBeginning(data);
        }
        NodeDouble current = head;
        NodeDouble previous = current.prev;
        for (int i=0; i<index; i++){
            if (current == null){
                System.out.println("Index out of Bounds");
                return;
            }
            current = current.next;
            previous = current.prev;
        }
        previous.next = newNode;
        newNode.prev = previous;
        newNode.next = current;
    }

    void deleteAtBeginning(){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        NodeDouble current = head;
        NodeDouble previous = null;

        while (current.next!= null){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }

    void deleteAtIndex(int index){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        NodeDouble current = head;
        NodeDouble previous = current.prev;
        for (int i=0; i<index; i++){
            if (current == null){
                System.out.println("Index Out of Bounds.");
                return;
            }
            
            current = current.next;
            previous = current.prev;
        }
        previous.next = current.next;
    }
    
    void displayList() {
        NodeDouble current = head;
        System.out.println("Current Linked List: ");
        while(current.next != null){
            System.out.print(current.data + " <> ");
            current = current.next;
        }
        System.out.println(current.data + " <> Null \n");
    }

}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyList list = new DoublyList();
        Random random = new Random();
        int OperationDelay = 2000; 
        try{
            System.out.println("Generating a Random Linked List. \n");
            Thread.sleep(OperationDelay);
            for (int i = 0; i < 5; i++){
                list.insertAtEnd(Integer.toString(random.nextInt(20)));
            }
            list.displayList();
            list.insertAtIndex(2, "69");
            list.displayList();
            list.deleteAtBeginning();
            list.displayList();
            list.deleteAtEnd();
            list.displayList();
            list.deleteAtIndex(1);
            list.displayList();
            



        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
