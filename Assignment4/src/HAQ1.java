
public class HAQ1 {

	public static void main(String[] args) {
		int sumsquare = 0, squaresum = 0;
		for (int i=1; i<=10; i++) {
			squaresum += (int) Math.pow(i,2);
			sumsquare += i;
		}
		System.out.println("The sum of the squares of the first ten natural numbers is: "+squaresum);
		System.out.println("The square of the sum of the first ten natural numbers is: "+(int)Math.pow(sumsquare,2));
		System.out.println("The difference is: "+(int)(Math.pow(sumsquare,2)-squaresum));
	}

}
