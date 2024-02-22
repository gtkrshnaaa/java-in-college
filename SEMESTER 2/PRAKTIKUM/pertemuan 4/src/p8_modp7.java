import java.util.Scanner;

public class p8_modp7 {
    public static void main(String[] args) {
        int b = 3; // baris matriks A
        int k = 3; // kolom matriks A, baris matriks B
        int d = 3; // kolom matriks B
        int[][] A = new int[b][k];
        int[][] B = new int[k][d];

        System.out.println("Masukkan nilai matriks A:");
        inputMatriks(A);

        System.out.println("Masukkan nilai matriks B:");
        inputMatriks(B);

        System.out.println("Matriks A:");
        printMatriks(A);

        System.out.println("Matriks B:");
        printMatriks(B);

        int[][] hasilKali = perkalianMatriks(A, B);

        System.out.println("Hasil perkalian matriks A dan B:");
        printMatriks(hasilKali);
    }

    static int input() {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        return b;
    }

    static void inputMatriks(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    static void printMatriks(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] perkalianMatriks(int[][] A, int[][] B) {
        int[][] hasilKali = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    hasilKali[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return hasilKali;
    }
}
