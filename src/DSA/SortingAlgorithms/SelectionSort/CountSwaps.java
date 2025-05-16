package DSA.SortingAlgorithms.SelectionSort;

public class CountSwaps {
    
    public static int sort(int[] arr){
        int swaps = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int smallestIndex = i;
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                    found = true;
                }
            }
            if(found){
                int temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
                swaps++;
            }
        }
        return swaps;
    }
    public static void printarray(String type, int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(i==0? type+": ["+arr[i] +", ":i==arr.length-1? arr[i]+"]\n":arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int[] targetarr = {64, 34, 25, 12, 22, 11, 90};
        printarray("UnSorted Array",targetarr);
        System.out.println("Number of swaps: "+sort(targetarr));
        printarray("Sorted Array", targetarr);
    }
}
