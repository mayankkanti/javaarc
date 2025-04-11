package Assignments.SecondSemester.Assignment3;

public class Q2 {
    public static void main(String[] args) {
        String[] favoriteColors = {"Blue", "Black", "Purple", "Red", "Green"};

        try{
            System.out.println(favoriteColors[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Tried to access an invalid index in the array.");
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Tried to operate on a null array.");
        }

    }
}
