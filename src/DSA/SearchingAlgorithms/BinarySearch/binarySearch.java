package DSA.SearchingAlgorithms.BinarySearch;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7,8,9,11,13,17,19,21};
        int target = 13;
        System.out.println("Target: " + target);
        System.out.println("Found at: " + search(arr, target));
    }

    static int search(int[] arr, int target){
        if (arr.length == 0) return -1;
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = (start + end) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
