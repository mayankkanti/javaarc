package DSA.SearchingAlgorithms.LinearSearch;



public class countEven {
// leet code problem 1295
    public static void main(String[] args) {
        int[] nums = {555,901,482,1771};

        System.out.println("Number of even numbers: " + findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums){
            if (iseven(num)){
                count++;
            }
        }
        return count;
    }
    static boolean iseven(int num){
        int numberOfDigits = digits(num);

        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        if (num < 0){
            num = -num;
        }

        int count = (int) Math.log10(num) + 1;
        return count;

    }
}
