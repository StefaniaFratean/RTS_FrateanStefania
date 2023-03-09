package lab1.LabSheet1;
/*
class Matrix {
    double[] R1 = new double[3];
    double[] R2 = new double[3];
    double[] R3 = new double[3];

    Matrix(double[] R1, double[] R2, double[] R3) {
        this.R1 = R1;
        this.R2 = R2;
        this.R3 = R3;
    }

    Matrix() {
        double[] zero1= {0, 0, 0};
        double[] zero2= {0, 0, 0};
        double[] zero3= {0, 0, 0};
        this.R1 = zero1;
        this.R2 = zero2;
        this.R3 = zero3;
    }

    Matrix sum(Matrix secondMat) {
        Matrix result = new Matrix();
        for (int i = 0; i < R1.length; i++) {
            result.R1[i] = this.R1[i] + secondMat.R1[i];
            result.R2[i] = this.R2[i] + secondMat.R2[i];
            result.R3[i] = this.R3[i] + secondMat.R3[i];
        }
        return result;
    }

    void printMatrix() {
        for (int i = 0; i < R1.length; i++) {
            System.out.print(R1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < R2.length; i++) {
            System.out.print(R2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < R3.length; i++) {
            System.out.print(R3[i] + " ");
        }
    }
}
*/

//Two 3X3 arrays are given,
//o first matrix: R1 = [2 3 1], R2 = [7 1 6], R3 = [9 2 4],
//o the second matrix: R1 = [8 5 3], R2 = [3 9 2], R3 = [2 7 3],
public class Ex2 {

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] matrix1 = {{2,3,1}, {7,1,6}, {9,2,4}};
        int[][] matrix2 = {{8,5,3}, {3,9,2}, {2,7,3}};

        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("Sum of the matrices:");
        printMatrix(sumMatrix);

        System.out.println("Product of the matrices:");
        printMatrix(productMatrix);




       /* double[] m1R1 = {2, 3, 1};
        double[] m1R2 = {7, 1, 6};
        double[] m1R3 = {9, 2, 4};

        double[] m2R1 = {8,5,3};
        double[] m2R2 = {3,9,2};
        double[] m2R3 = {2,7,3};

        Matrix matrix1 = new Matrix(m1R1, m1R2, m1R3);
        Matrix matrix2 = new Matrix(m2R1, m2R2, m2R3);

        Matrix sumRes = matrix1.sum(matrix2);
        sumRes.printMatrix();*/

    }
}


