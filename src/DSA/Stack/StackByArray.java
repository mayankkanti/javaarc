package DSA.Stack;

import java.util.Scanner;

class stack {
    int[] list;
    int top;
    stack(int size){
        list = new int[size];
        top = -1;
    }

    void push(int data){
        if (top == list.length - 1){
            System.out.println("The list is full.");
            return;
        }
        top++;
        list[top] = data;
        System.out.printf("%d was pushed in the stack. \n", data);
    }

    void pop(){
        if (top == -1){
            System.out.println("The list is empty.");
            return;
        }
        System.out.println(list[top] + " has been removed/popped.");
        list[top] = 0;
        top--;
    }

    void displayStack(){
        if (top == -1){
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Current Stack: ");
        for(int i=0; i<top; i++){
            System.out.print(list[i] + " > ");
        }
        System.out.print(list[top] + "\n");
    }

}

public class StackByArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack list = null;
        boolean running = true;
        while (running){
            System.out.println("---- Stack ----");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Push");
            System.out.println("4. Pop");
            System.out.println("5. Exit \n");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the size of the stack: ");
                    int size = sc.nextInt();
                    list = new stack(size);
                    break;
                case 2:
                    if (list == null){
                        System.out.println("Stack has not been created yet.");
                    } else{
                        list.displayStack();
                    }
                    break;
                case 3:
                    if (list == null){
                        System.out.println("Stack has not been created yet.");
                    } else{
                        System.out.print("Enter data to push: ");
                        int data = sc.nextInt();
                        list.push(data);
                    }
                    break;
                case 4:
                    if (list == null){
                        System.out.println("Stack has not been created yet.");
                    } else{
                        list.pop();
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
