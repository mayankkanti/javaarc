package Assignments.SecondSemester.Assignment3;

public class Q5 {
    public static < E > void printArray( E[] inputArray ) {
        for ( E element : inputArray ) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] stringArray = { "Hello", ",", "My", "name", "is", "Mayank" };
        Integer[] integerArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        System.out.println("String Array: ");
        printArray(stringArray);

        System.out.println("Integer Array: ");
        printArray(integerArray);

        System.out.println("Double Array: ");
        printArray(doubleArray);
    }
}
