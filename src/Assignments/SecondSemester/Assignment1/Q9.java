package Assignments.SecondSemester.Assignment1;
package lab_assignments;

public class Q9 {
    public static double sumMajorDiagonal(double[][] m){
        // main questions problem
        double sum = 0;
        for (int i=0; i<4; i++) {
            sum += m[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // randomly generating a 4 x 4 matrix
        // you can take a pre-defined matrix as well or take input from user (ex previous question)
        double[][] matrix = new double[4][4];
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                double random = Math.random() * 100;
                matrix[i][j] = Math.round(random * 100.0) / 100.0;
            }
        }

        // printing the matrix
        // this is just for the sake of understanding
        System.out.println("The matrix is: ");
        for (int i=0; i<4; i++) {
            System.out.print("[");
            for (int j=0; j<4; j++) {
                System.out.print(matrix[i][j] + (j == 3 ? "]" : ", "));
            }
            System.out.println();
        }

        // printing the sum of the major diagonal
        System.out.println("The sum of the major diagonal is: " + sumMajorDiagonal(matrix));
    }
}

