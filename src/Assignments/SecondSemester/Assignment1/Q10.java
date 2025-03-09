package Assignments.SecondSemester.Assignment1;

public class Q10 {
    public static void main(String[] args) {

        // randomly generating a 3 x 4 matrix
        double[][] matrix = new double[3][4];
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                double random = Math.random() * 100;
                matrix[i][j] = Math.round(random * 10.0) / 10.0;
            }
        }

        // printing said matrix
        System.out.println("The matrix is: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
        

        // actual question problem
        for (int col=0; col<4; col++){
            double sum = 0;
            for (int row=0; row<3; row++){
                sum += matrix[row][col];
            }
            System.out.println("Sum of elements of column "+col+" is: "+sum);
        }
    }
}

