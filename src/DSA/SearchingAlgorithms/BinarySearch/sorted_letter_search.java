package DSA.SearchingAlgorithms.BinarySearch;
// leet code question 744 (easy)
// Given a list of sorted characters letters containing only lowercase letters, and given a target letter target, find the smallest element in the list that is larger than the given target.
// basically find the smallest letter in the list that is larger than the target letter
// return letters[0] if no such letter exists
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class sorted_letter_search {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'd' ,'f', 'h'};
        char target = 'c';
        int ans = nextGreatestLetter(letters, target);
        System.out.println("Target: " + target + "\nFound At: " + ans + "\nElement: " + (ans > -1 ? letters[ans] : "Not Found"));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if (target >= letters[end]) return letters[0];

        while (start <= end) {
            int mid = (start + end) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}
