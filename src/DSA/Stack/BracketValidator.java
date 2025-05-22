package DSA.Stack;

// import java.util.Scanner;

public class BracketValidator {
    static boolean LOGGER = true;
    static Node head;
    
    static private class Node {
        char data;
        Node next;
        Node(char data){
            this.data = data;
            next = null;
        }
    }
    
    static void push(char data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    static char pop(){
        if (head == null){
            System.out.println("Empty Stack");
            return '?';
        }
        if (head.next == null) {
            char data = head.data;
            head = null;
            return data;
        }
        Node current = head;
        Node previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current.data;
    }

    static boolean isEmpty(){
        return head == null;
    }

    static boolean validateString(String s){

        for (char ch : s.toCharArray()) {
            if (ch=='[' || ch=='(' || ch=='{'){
                push(ch);   
            } else{
                if (isEmpty()) return false;
                char popped_data = pop();
                if (ch==']'&&popped_data!='[' || ch==')'&&popped_data!='(' || ch=='}'&&popped_data!='{'){
                    return false;
                }
            }
        }
        return isEmpty();
    }

    public static void runTests(String[] cases, boolean shouldBeValid) {
        for (int i = 0; i < cases.length; i++) {
            String input = cases[i];
            String inputParsed = cases[i].replaceAll("[^(){}\\[\\]]", "");
            boolean actual = validateString(inputParsed);
            System.out.printf("Test %2d: %-35s → %s (Expected: %s)\n",
                i + 1, "\"" + input + "\"", actual ? "Valid" : "Invalid", shouldBeValid ? "Valid" : "Invalid");
        }
    }

    public static void main(String[] args) {
        String[] validCases = {
            "()",
            "([])",
            "({[]})",
            "[{()}]",
            "a + (b - c) * {d / [e + f]}",
            "",
            "((())){{[[]]}}"
        };

        String[] invalidCases = {
            "(",
            ")(",
            "(]",
            "([)]",
            "{[(])}",
            "[({})",
            "a * (b + c] - {d}",
            "(()))",
            "((("
        };

        System.out.println("Valid Cases:");
        runTests(validCases, true);

        System.out.println("\nInvalid Cases:");
        runTests(invalidCases, false);
    }
}
