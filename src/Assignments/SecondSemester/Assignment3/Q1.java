package Assignments.SecondSemester.Assignment3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Your Lucky Number.");
            int num = sc.nextInt();
            if (num < 0){
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException e){
            System.out.println("The Number is -ve so error.");
            System.out.println(e);
        }
        finally{
            sc.close();
        }
        sc.close();
    }
}
