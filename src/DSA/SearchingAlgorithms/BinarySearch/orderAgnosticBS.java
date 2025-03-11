package DSA.SearchingAlgorithms.BinarySearch;

// OrderAgnostic just means that you don't know the order of the sorted Array
// So you just need to figure out if the array is in ascending or decending order
// and code accordingly

public class orderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 11, 13, 17, 19, 21};
        int arr1[] = {87, 77, 67, 56, 54, 43, 32, 30, 21, 19, 9, 5};
        int target = 13;
        int target1 = 21;
        System.out.println("Target for arr: " + target);
        System.out.println("Found at: " + search(arr, target));
        System.out.println("Target for arr1: " + target1);
        System.out.println("Found at: " + search(arr1, target1));
    }

    static int search(int arr[], int target){
        if (arr.length == 0) return -1;
        int start = 0;
        int end =  arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start < end){
            int mid = (start + end) / 2;

            if (arr[mid] == target) return mid;

            if (isAsc) {
                if (arr[mid] < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if (arr[mid] > target) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}
