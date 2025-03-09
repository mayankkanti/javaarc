/*
 * Write a java program that takes three int values from the command line and prints them in 
ascending order. Use Math.min() and Math.max().
 */
public class CLQ5 {
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);  //25
		int b=Integer.parseInt(args[1]);  // 7
		int c=Integer.parseInt(args[2]);  //10
		
		int max= Math.max(a, Math.max(b, c));
		int min= Math.min(a, Math.min(b, c));
		int mid= (a+b+c)-(max+min);
		
		System.out.println("Ascending Order of the inputted Number is: "+min+" "+mid+" "+max);
	}
}
