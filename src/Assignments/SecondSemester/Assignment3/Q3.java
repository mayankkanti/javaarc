package Assignments.SecondSemester.Assignment3;

//Create a class Student & enter mark, name of the student. If mark is more than 100, create
//exception MarksOutOfBoundException & throw it using Java.

class MarksOutOfBoundException extends Exception{
    MarksOutOfBoundException(String Message){
        super(Message);
    }
}

class Student{
    String name;
    int mark;
    Student(String name, int mark) throws MarksOutOfBoundException {
        this.name = name;
        if (mark > 100) throw new MarksOutOfBoundException("Mark can't be over 100.");
        this.mark = mark;

    }
}


public class Q3 {
    public static void main(String[] args) {
        try {
            Student c1 = new Student("Mayank", 99);
            Student c2 = new Student("AlsoMayank", 102);
            System.out.println("Student 1: " + c1.name + ", Marks: " + c1.mark);
            System.out.println("Student 2: " + c2.name + ", Marks: " + c2.mark);
        }
        catch (MarksOutOfBoundException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }
    
    }
}
