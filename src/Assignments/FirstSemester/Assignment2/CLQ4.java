
public class CLQ4 {

	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		System.out.println("Entered value of t "+t);
		double result = (Math.cos(5*t)+Math.sin(7*t));
		System.out.println("Math.cos(5*t)+Math.sin(7*t) = "+result);
	}

}
