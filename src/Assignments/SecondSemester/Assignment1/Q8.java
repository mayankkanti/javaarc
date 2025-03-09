package Assignments.SecondSemester.Assignment1;
package lab_assignments;

import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of 2D array: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of 2D array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        System.out.println("The elements of 2D array are: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("The sum of all elements of 2D array is: " + sum);
        sc.close();
    }
}
