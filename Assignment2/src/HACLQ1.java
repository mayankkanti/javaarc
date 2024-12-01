/*Write a java program to take three inputs from command line argument as principle, rate and
time. Find Simple interest.*/
public class HACLQ1 {
	public static void main(String[] args) {
		int principle = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int time = Integer.parseInt(args[2]);
		int simpleint = (principle*rate*time/100);
		System.out.println("The Simple Interest is "+simpleint);
	}
}