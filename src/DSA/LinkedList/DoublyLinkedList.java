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
        
        for (int i=0; i<index; i++){
            if (current == null){
                System.out.println("Index out of Bounds");
                return;
            }
            current = current.next;
        }

        NodeDouble previous = current.prev;
        
        previous.next = newNode;
        current.prev = newNode;

        newNode.next = current;
        newNode.prev = previous;
    }

    void deleteAtBeginning(){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
        head.prev = null;
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

        if (index == 0){
            deleteAtBeginning();
            return;
        }

        NodeDouble current = head;

        for (int i=0; i<index; i++){
            if (current == null){
                System.out.println("Index Out of Bounds.");
                return;
            }
            
            current = current.next;
        }

        if (current.next == null){
            deleteAtEnd();
            return;
        }

        NodeDouble previous = current.prev;
        previous.next = current.next;
        current.next.prev = previous;
    }

    void deleteByData(String target) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        NodeDouble current = head;
        NodeDouble previous = head.prev;
        int index = 0;
        boolean found = false;

        while (current!=null){
            NodeDouble next = current.next; 
            if (current.data.equals(target)){
                if (previous == null){
                    // this is if the target is found at head
                    head = next;
                    head.prev = null;
                } else if(next == null){
                    // this is if the target is found at end
                    previous.next = null; 
                } else{
                    // elsewhere
                    previous.next = next;
                    next.prev = previous;
                }
                found = true;
                System.out.printf("Data %s deleted at index %d \n", target, index);
            }
            
            previous = current;
            current = current.next;
            index++;
        }

        if(!found){
            System.out.printf("No data with values %s was found. \n", target);
        }

    }
    
    void updateByIndex(int index, String data){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        NodeDouble current = head;
        for (int i=0; i<index; i++){
            if (current == null){
                System.out.println("Index Out Of Bounds");
                return;
            }
            current = current.next;
        }
        System.out.printf("Updated data at index %d from %s to %s \n", index, current.data, data);
        current.data = data;
    }

    void updateByData(String target, String data){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        NodeDouble current = head;
        int index = 0;
        while (current != null){
            if (current.data.equals(target)){
                System.out.printf("Updated data at index %d to %s \n", index, data);
                current.data = data;
            }
            current = current.next;
            index++;
        }
    }

    void searchByIndex(int index){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        NodeDouble current = head;
        for (int i=0; i<index; i++){
            if (current == null){
                System.out.println("Index Out Of Bounds");
                return;
            }
            current = current.next;
        }
        System.out.printf("Data at index %d is %s \n", index, current.data);
    }

    void searchByData(String target){
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        NodeDouble current = head;
        int index = 0;
        while (current != null){
            if (current.data.equals(target)){
                System.out.printf("Found %s at index %d \n",target, index);
            }
            current = current.next;
            index++;
        }
    }

    int len() {
        if (head == null){
            return 0;
        }
        NodeDouble current = head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    // gpt'ed, just for checking purpose
    boolean validateList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return true; // An empty list is considered valid
        }

        NodeDouble current = head;
        NodeDouble previous = null;

        while (current != null) {
            // Check if the current node's prev pointer points to the previous node
            if (current.prev != previous) {
                System.out.printf("Validation failed at node with data %s. Incorrect prev pointer.\n", current.data);
                return false;
            }

            // Move to the next node
            previous = current;
            current = current.next;
        }

        System.out.println("The doubly linked list is valid.");
        return true;
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

    static void insertOperations(DoublyList list, int OperationDelay) throws InterruptedException{
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
        list.insertAtIndex(4, "69");
        list.displayList();
    }
    
    static void deleteOperations(DoublyList list, int OperationDelay) throws InterruptedException{
        System.out.println("Deleting Node at Beginning. \n");
        Thread.sleep(OperationDelay);
        list.deleteAtBeginning();
        list.displayList();

        System.out.println("Deleting Node at End. \n");
        Thread.sleep(OperationDelay);
        list.deleteAtEnd();
        list.displayList();

        System.out.println("Deleting Node at Index 5. \n");
        Thread.sleep(OperationDelay);
        list.deleteAtIndex(5);
        list.displayList();

        System.out.println("Deleting Node With Data 22. \n");
        Thread.sleep(OperationDelay);
        list.deleteByData("22");
        list.displayList();
    }
    
    static void updateOperations(DoublyList list, int OperationDelay) throws InterruptedException{
        System.out.println("Updating data at index 2 to 22. \n");
        Thread.sleep(OperationDelay);
        list.updateByIndex(2, "22");
        list.displayList();

        System.out.println("Updating all data with value 69 to 11. \n");
        Thread.sleep(OperationDelay);
        list.updateByData("69", "11");
        list.displayList();
    }

    static void searchOperations(DoublyList list, int OperationDelay) throws InterruptedException{
        System.out.println("Searching data at index. \n");
        Thread.sleep(OperationDelay);
        list.searchByIndex(2);
        list.displayList();

        System.out.println("Seaching all nodes with value 69. \n");
        Thread.sleep(OperationDelay);
        list.searchByData("69");
        list.displayList();
    }
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
            System.out.println("List Validation: " + list.validateList());
            
            insertOperations(list, OperationDelay);
            deleteOperations(list, OperationDelay);
            updateOperations(list, OperationDelay);
            searchOperations(list, OperationDelay);

            System.out.println("List Validation: " + list.validateList());
            

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
