package DSA.SearchingAlgorithms.LinearSearch;

class maximumWealth {
// leet code problem 1672
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};

        System.out.println("Maximum wealth: " + maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account: accounts){
            int sum = 0;
            for (int value: account){
                sum += value;
            }
            if (sum > maxWealth) maxWealth = sum;
        }
        return maxWealth;
    }
}