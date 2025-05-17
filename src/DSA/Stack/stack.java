package DSA.Stack;

import java.util.Scanner;

class Node <T> {
    protected T data;
    protected Node<T> next;
    Node(T data){
        this.data = data;
        next = null;
    }
}

class stacklist <T> {
    private Node<T> top;
    private int size;

    stacklist(){
        top = null;
        size = 0;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public T pop(){
        if (top == null) {
            return null;
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public T peek(){
        if (top == null) {
            return null;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}

public class stack {
    public static void main(String[] args) {
        stacklist<Integer> stack = new stacklist<Integer>();
        while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Is Empty");
            System.out.println("5. Get Size");
            System.out.println("6. Exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data to push: ");
                    int data = sc.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    Integer poppedData = stack.pop();
                    if (poppedData != null) {
                        System.out.println("Popped data: " + poppedData);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    Integer peekedData = stack.peek();
                    if (peekedData != null) {
                        System.out.println("Top data: " + peekedData);
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack size: " + stack.getSize());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
            sc.close();
        }
    }
}
