
public class overflow_temp {

	public static void main(String[] args) {
		int a = -13;
		int b = -26;
		int c = a>>2*b--+b++;
		System.out.println(c);
	}

}
