import java.util.Scanner;

public class p5_modp4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        int[][] y = {{3, 6, 1}, {4, 7, 9}};

        int baris = 2;
        int kolom = 3;

        int[][] z = new int[baris][kolom];

        System.out.println("Ini adalah matriks x:");

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Ini adalah matriks y:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan matriks x dan y:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                z[i][j] = x[i][j] + y[i][j];
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }

        // Menampilkan hasil pengurangan
        System.out.println("Hasil pengurangan matriks x dan y:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                z[i][j] = x[i][j] - y[i][j];
                System.out.print(z[i][j] + " ");
            }
            System.out.println();
        }
    }
}
