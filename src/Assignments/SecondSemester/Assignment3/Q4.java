package Assignments.SecondSemester.Assignment3;

class Box <T> {
    T content;
    Box(T content) {
        this.content = content;
    }

    T getContent() {
        return content;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Mayank!");
        Box<Integer> integerBox = new Box<>(1234);
        Box<Double> doubleBox = new Box<>(3.14);

        System.out.println("String content: " + stringBox.getContent());
        System.out.println("Integer content: " + integerBox.getContent());
        System.out.println("Double content: " + doubleBox.getContent());
        
    }
}
