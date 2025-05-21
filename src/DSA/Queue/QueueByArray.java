package DSA.Queue;

import java.util.Scanner;

class queue{
    int[] list;
    int rear;

    queue(int size){
        list = new int[size];
        rear = -1;
    }

    void enqueue(int data){
        if (rear == list.length - 1){
            System.out.println("The queue is full.");
            return;
        }
        rear++;
        list[rear] = data;
        System.out.printf("%d was added to the queue. \n", data);
    }

    void dequeue() {
        if (rear == -1){
            System.out.println("The queue is empty.");
            return;
        }
        
        System.out.printf("%d has been removed from the queue. \n", list[0]);
        rear--;
        for(int i=0; i<=rear; i++){
            list[i] = list[i+1];
        }
    }

    void display() {
        if (rear == -1){
            System.out.println("The queue is empty.");
            return;
        }
        
        System.out.println("Current Queue: ");
        for(int i=0; i<=rear; i++){
            System.out.print(i==rear? list[i] + "\n\n" : list[i] + " < ");
        }
    }

}

public class QueueByArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue list = null;
        boolean running = true;
        while (running){
            System.out.println("---- Queue ----");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Enqueue");
            System.out.println("4. Dequeue");
            System.out.println("5. Exit \n");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the size of the Queue: ");
                    int size = sc.nextInt();
                    list = new queue(size);
                    break;
                case 2:
                    if (list == null){
                        System.out.println("Queue has not been created yet.");
                    } else{
                        list.display();
                    }
                    break;
                case 3:
                    if (list == null){
                        System.out.println("Queue has not been created yet.");
                    } else{
                        System.out.print("Enter data to Enqueue: ");
                        int data = sc.nextInt();
                        list.enqueue(data);
                    }
                    break;
                case 4:
                    if (list == null){
                        System.out.println("Queue has not been created yet.");
                    } else{
                        list.dequeue();
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invaild Choice \n \n");
            }
        }
        sc.close();
    }
}
