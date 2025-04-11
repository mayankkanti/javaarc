package Others;

public class Leetcode67_AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b){ 
        int a_int = Integer.parseInt(a);
        int b_int = Integer.parseInt(b);
        String sum = Integer.toString(a_int + b_int);

		return sum;
    }
}
