package Assignments.SecondSemester.Assignment6;
import java.util.Scanner;

public class Q1PART1 {

    public static final int MAX = 10;
    public static Scanner input = new Scanner(System.in);

    public static int push(int S[], int top) {
        if (top == MAX-1){
            System.out.println("The stack is full.");
            return top;
        }

        top++;
        System.out.print("Enter the data to push:");
        int data = input.nextInt();
        S[top] = data;
        System.out.printf("%d was pushed into the stack. \n", data);

        return top;
    }

    public static int pop(int S[], int top) {
        if (top == -1){
            System.out.println("The stack is empty.");
            return top;
        }

        System.out.printf("%d was popped out of the stack. \n", S[top]);
        top--;
        
        return top;
    }

    public static void display(int S[], int top) {
        if (top == -1){
            System.out.println("The stack is empty.");
            return;
        }

        System.out.println("Current stack: ");
        for (int i=0; i<=top; i++){
            System.out.print(i==top? S[i] + "\n" : S[i] + " > ");
        }
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static boolean isFull(int top) {
        return top == MAX - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        int stack[] = new int[MAX];
        int top = -1;

        while (running) {
            System.out.println("*** MENU ***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 0:
                running = false;
                break;
                case 1:
                top = push(stack, top);
                break;
                case 2:
                top = pop(stack, top);
                break;
                case 3:
                display(stack, top);
                break;
                default:
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
