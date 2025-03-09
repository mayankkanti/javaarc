package Assignments.SecondSemester.Assignment1;
//Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
// method can't use the multiplication, modulus, or division operators, The method signature is
// as follows.



import java.util.Scanner;


public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if (isOdd(num)) System.out.println("The number is odd.");
        else System.out.println("The number is even.");
        sc.close();
    }
    public static boolean isOdd(int i) {
        if ((i & 1) == 1) return true;
        return false;
    }
}

