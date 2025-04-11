package Assignments.SecondSemester.Assignment3;

public class Q6 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element.equals(item)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] stringArray = { "apple", "banana", "apple", "orange", "banana", "apple" };
        Integer[] integerArray = { 1, 2, 3, 1, 4, 1 };

        String itemToCountString = "apple";
        Integer itemToCountInteger = 1;

        int stringCount = count(stringArray, itemToCountString);
        int integerCount = count(integerArray, itemToCountInteger);

        System.out.println("Count of \"" + itemToCountString + "\": " + stringCount);
        System.out.println("Count of \"" + itemToCountInteger + "\": " + integerCount);
    }
}
