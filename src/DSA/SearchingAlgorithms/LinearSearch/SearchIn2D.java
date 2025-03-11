package DSA.SearchingAlgorithms.LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{29, 14, 67}, {94, 44, 97}, {62, 19, 21}};

        System.out.println("2D Array: " + Arrays.deepToString(arr));

        int target = 19;
        int[] ans = searchIn2D(arr, target);
        int max = max(arr);
        int min = min(arr);
        System.out.println("Target: " + target);
        System.out.println("Target found at: " + Arrays.toString(ans));
        System.out.println("Maximum Element: " + max);
        System.out.println("Minimum Element: " + min);

    }

    static int[] searchIn2D(int[][] arr, int target){
        if (arr.length == 0){
            return new int[]{-1, -1};
        }

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int max(int arr[][]){
        // assuming the array is of length != 0
        int max = arr[0][0];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }

        return max;
    }

    static int min(int arr[][]){
        // assuming the array is of length != 0
        int min = arr[0][0];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if (arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }

        return min;
    }
}
