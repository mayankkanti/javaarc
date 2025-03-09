package Assignments.FirstSemester.Assignment2;

//Write a java program to input a character from command line and display the ASCII value of
//the entered character.
public class CLQ6 {
	public static void main(String[] args) {
		char a = args[0].charAt(0);
		int ascii = a;
		System.out.println("The ascii value of inputted char \""+a+"\" is "+ascii);
	}
}
