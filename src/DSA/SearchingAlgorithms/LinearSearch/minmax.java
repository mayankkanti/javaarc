package DSA.SearchingAlgorithms.LinearSearch;

import java.util.Arrays;

public class minmax {
    public static void main(String[] args) {
        // generating a random array
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random()*100);
        }
        System.out.println("Array: " + Arrays.toString(arr));

        int min_element = min(arr);
        int max_element = max(arr);
        
        System.out.println("Minimum Element: " + min_element);
        System.out.println("Maximum Element: " + max_element);
    }

    static int min(int[] arr){
        // assuming the array is of length != 0
        int min = arr[0];

        for(int index = 0; index < arr.length; index++){
            if (arr[index] < min){
                min = arr[index];
            }
        }

        return min;
    }

    static int max(int[] arr){
        // assuming the array is of length != 0
        int max = arr[0];

        for(int index = 0; index < arr.length; index++){
            if (arr[index] > max){
                max = arr[index];
            }
        }

        return max;
    }
}
