package DSA.SortingAlgorithms.BubbleSort;

public class BubbleSort {
    public static int[] sort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return arr;
    }
    public static void printarray(String type, int[] arr){
        for (int i=0; i<arr.length; i++){
            // le me after right this: https://cdn.imgchest.com/files/45xcvnlpq57.jpg
            System.out.print(i==0? type+": ["+arr[i] +", ":i==arr.length-1? arr[i]+"]\n":arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int[] targetarr = {64, 34, 25, 12, 22, 11, 90};
        printarray("UnSorted Array",targetarr);
        int[] sorted = sort(targetarr);
        printarray("Sorted Array", sorted);
    }
}
