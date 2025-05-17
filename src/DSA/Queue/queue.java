package DSA.Queue;

class Node <T> {
    protected T data;
    protected Node<T> next;
    Node(T data){
        this.data = data;
        next = null;
    }
}

class queuelist <T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    queuelist(){
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue(){
        if (front == null) {
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public T peek(){
        if (front == null) {
            return null;
        }
        return front.data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}

public class queue {
    
}
