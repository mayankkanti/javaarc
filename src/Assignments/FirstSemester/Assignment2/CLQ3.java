//
//public class CLQ3 {
//
//	public static void main(String[] args) {
//		int max, min, randno1, randno2;
//		max = 6;
//		min = 0;
//		randno1 = (int) (Math.random()*(max - min + 1) + min);
//		randno2 = (int) (Math.random()*(max - min + 1) + min);
//		System.out.println("Picked two random number i.e. "+randno1+","+randno2);
//		System.out.println("The sum of two random numbers is "+(randno1+randno2));
//	}
//
//}

// idk what this questions means, im assuming they need me to input 2 ints thru command line and add the sum?....?!?!?
package Assignments.FirstSemester.Assignment2;
public class CLQ3 {

	public static void main(String[] args) {
		int randno1, randno2;
		randno1 = Integer.parseInt(args[0]);
		
		randno2 = Integer.parseInt(args[1]);
		System.out.println("The entered no is "+randno1+","+randno2);
		System.out.println("The Sum is "+(randno1+randno2));
	}

}