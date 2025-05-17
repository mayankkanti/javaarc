package DSA.SortingAlgorithms.InsertionSort;

public class InsertionSort {
    public static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i=1; i<n; i++){
            int key = arr[i];
            int index = i - 1;
            while (index>=0 && arr[index] > key){
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index+1] = key;
        }
        return arr;
    }
    public static void printarray(String type, int[] arr){
        for (int i=0; i<arr.length; i++){
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
