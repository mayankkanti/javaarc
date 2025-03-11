package DSA.SearchingAlgorithms.LinearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {9, 11, 2, 5, 7, 8, 3, 19, 21, 4, 6};
        int target = 19;
        int ans = Search(arr, target);
        System.out.println(ans);
    }

    static int Search(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index<arr.length; index++){
            if (arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
