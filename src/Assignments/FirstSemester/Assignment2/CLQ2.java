public class CLQ2 {

	public static void main(String[] args) {
		int firstNum, secondNum, result;
		firstNum = Integer.parseInt(args[0]);
		secondNum = Integer.parseInt(args[1]);
		result = (int) Math.pow(firstNum, secondNum);
		System.out.println("Entered Numbers are "+args[0]+ ","+args[1]);
		System.out.println("Result of first number raise to the power of second number is "+result);
	}
}
