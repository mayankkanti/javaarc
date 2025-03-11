package DSA.SearchingAlgorithms.BinarySearch;

public class ceilingOfNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 11, 13, 17, 19, 21};
        int target = 22;
        int ans = ceilingBS(arr, target);
        System.out.println("Target: " + target + "\nFound At: " + ans + "\nElement: " + (ans > -1 ? arr[ans] : "Not Found"));
    }
    static int ceilingBS(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        if (isAsc) {
            if (target > arr[end]) return -1;
        } else {
            if (target < arr[end]) return -1;
        }

        while(start < end){
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

        return isAsc? start : end;
    } 
}
