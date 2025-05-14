package DSA.LinkedList;

import java.lang.Thread;
import java.util.Random;

class NodeSingle {
    String data;
    NodeSingle next;
    
    NodeSingle(String data) {
        this.data = data;
        this.next = null;
    }
}


// TO-DO (what? https://cdn.imgchest.com/files/yd5ceola3p4.png)
// Sorting
// Get Middle Node
// Removing Duplicates
// Merging

class SinglyList {
    NodeSingle head;

    void insertAtBeginning(String data){
        NodeSingle newNode = new NodeSingle(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(String data) {
        NodeSingle newNode = new NodeSingle(data);
        if (head == null){
            head = newNode;
            return;
        }

        NodeSingle current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    void insertAtIndex(int index, String data){
        NodeSingle newNode = new NodeSingle(data);
        if (index == 0){
            insertAtBeginning(data);
            return;
        }
        NodeSingle current = head;
        NodeSingle previous = null;
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
    
    void deleteAtBeginning(){
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }
        head = head.next;
    }
    
    void deleteAtEnd() {
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }

        NodeSingle current = head;
        NodeSingle previous = null;
        while (current.next != null){
            previous = current;
            current = current.next;
        }

        previous.next = null;

    }
    
    void deleteAtIndex(int index) {
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }

        NodeSingle current = head;
        NodeSingle previous = null;

        for(int i = 0; i < index; i++){
            if (current == null){
                System.out.println("Index out of bounds.");
                return;
            }
            
            previous = current;
            current = current.next;
        }

        previous.next = current.next;
    }
    
    void deleteByData(String target) {
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }

        NodeSingle current = head;
        NodeSingle previous = null;
        boolean found = false;
        int index = 0;

        while(current!=null){
            if (current.data.equals(target)){
                previous.next = current.next;
                found = true;
                System.out.printf("Data %s deleted at index %d", target, index);
                break;
            }
            previous = current;
            current = current.next;
            index++;
        }
        if (!found){
            System.out.println("Data not found.");
        }
    }
    
    void searchByData(String data) {
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }

        NodeSingle current = head;
        int index = 0;
        boolean found = false;

        while (current!= null){
            if (current.data.equals(data)){
                found = true;
                System.out.printf("Found %s at index %d \n", data, index);
            }
            current = current.next;
            index++;
        }

        if (!found){
            System.out.printf("No data found with value %s \n", data);
        }
    }
    
    void searchByIndex(int index) {
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }
        NodeSingle current = head;
        for (int i = 0; i < index; i++){
            if (current == null){
                System.out.println("Index out of bounds.");
                return;
            }
            current = current.next;
        }

        System.out.printf("Data at Index %d is %s \n", index, current==null?null:current.data);
    }

    void updateByIndex(int index, String data) {
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }
        NodeSingle current = head;
        for (int i = 0; i < index; i++){
            if (current.next == null){
                System.out.println("Index out of bounds.");
                return;
            }
            current = current.next;
        }
        System.out.printf("Update data at index %d from %s to %s \n", index, current.data, data);
        current.data = data;
        
    }

    void updateByData(String target, String data){
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }
        NodeSingle current = head;
        int index = 0;
        boolean found = false;
        while (current.next != null){
            if (current.data.equals(target)){
                found = true;
                current.data = data;
                System.out.printf("Updated data at index %d from %s to %s \n", index, target, data);
            }
            current = current.next;
            index++;
        }
        if (!found){
            System.out.printf("No node found with data %s \n", target);
        }
    }

    void reverse(){
        if (head == null){
            System.out.println("The List is Empty.");
            return;
        }

        if (head.next == null){
            System.out.println("There's only one Node in the list.");
            return;
        }

        NodeSingle previous = null;
        NodeSingle current = head; 
        while (current != null){
            NodeSingle next = current.next;
            current.next = previous;  
            previous = current;
            current = next; 
        }
        head = previous;
    }
    
    int len() {
        if (head == null){
            return 0;
        }
        NodeSingle current = head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    void displayList() {
        NodeSingle current = head;
        System.out.println("Current Linked List: ");
        while(current.next != null){
            System.out.print(current.data + " > ");
            current = current.next;
        }
        System.out.println(current.data + " > Null \n");
    }

}

public class SinglyLinkedList {

    static void insertOperations(SinglyList list, int OperationDelay) throws InterruptedException{
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

    static void deleteOperations(SinglyList list, int OperationDelay) throws InterruptedException{
        System.out.println("Deleting Node at Beginning. \n");
        Thread.sleep(OperationDelay);
        list.deleteAtBeginning();
        list.displayList();

        System.out.println("Deleting Node at End. \n");
        Thread.sleep(OperationDelay);
        list.deleteAtEnd();
        list.displayList();

        System.out.println("Deleting Node at Index 2. \n");
        Thread.sleep(OperationDelay);
        list.deleteAtIndex(2);
        list.displayList();
    }

    static void searchOperations(SinglyList list, int OperationDelay) throws InterruptedException{
        System.out.println("Searching by data value 69");
        Thread.sleep(OperationDelay);
        list.searchByData("69");
        list.displayList();

        System.out.println("Searching data at index 5");
        Thread.sleep(OperationDelay);
        list.searchByIndex(5);
        list.displayList();
    }
    
    static void updateOperations(SinglyList list, int OperationDelay) throws InterruptedException{
        System.out.println("Updating data at index 2 to 55");
        Thread.sleep(OperationDelay);
        list.updateByIndex(2, "12");
        list.displayList();

        System.out.println("Updating all nodes with data 12 to 22");
        Thread.sleep(OperationDelay);
        list.updateByData("12", "22");
        list.displayList();
    }
    public static void main(String[] args) {
        

        Random random = new Random();
        int OperationDelay = 2500;

        try {
            SinglyList list = new SinglyList();

            System.out.println("Generating a Random Linked List. \n");
            Thread.sleep(OperationDelay);
            for (int i = 0; i < 5; i++){
                list.insertAtEnd(Integer.toString(random.nextInt(20)));
            }
            list.displayList();
            
            // insertOperations(list, OperationDelay);
            // deleteOperations(list, OperationDelay);
            // searchOperations(list, OperationDelay);
            // updateOperations(list, OperationDelay);

            // System.out.println("Reversing the List.");
            // Thread.sleep(OperationDelay);
            // list.reverse();
            // list.displayList();
            list.insertAtBeginning("22");
            // list.insertAtEnd("22");
            list.displayList();

            list.deleteByData("22");

            list.displayList();
            
            System.out.println("Length Of the List: ");
            System.out.println(list.len());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }    
}
