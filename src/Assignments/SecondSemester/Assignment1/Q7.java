package Assignments.SecondSemester.Assignment1;


import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the Array: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max_element = Integer.MIN_VALUE;
        int min_element = Integer.MAX_VALUE;

        int max_count = 0;
        int min_count = 0;

        int max_first_index = 0;
        int min_last_index = 0;

        for (int i=0; i<n; i++) {
            if (arr[i] > max_element) {
                max_element = arr[i];
                max_count = 1;
                max_first_index = i;
            } else if (arr[i] == max_element) {
                max_count++;
            }
            if (arr[i] < min_element) {
                min_element = arr[i];
                min_count = 1;
                min_last_index = i;
            } else if (arr[i] == min_element) {
                min_count++;
                min_last_index = i;
            }
        }

        System.out.println("Maximum element of Array is "+max_element+" and occurs "+max_count+" times.");
        System.out.println("Minimum element of Array is "+min_element+" and occurs "+min_count+" times.");
        System.out.println("First occurrence of maximum element is at position "+max_first_index);
        System.out.println("Last occurrence of minimum element is at position "+min_last_index);        
        sc.close();
    }
}

