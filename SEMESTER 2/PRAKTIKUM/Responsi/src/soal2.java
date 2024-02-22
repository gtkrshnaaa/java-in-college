import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        int sum = sumSeries(n);
        System.out.println("S = " + getSeriesString(n) + " = " + sum);
    }

    public static int sumSeries(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (2 * n - 1) + sumSeries(n - 1);
        }
    }

    public static String getSeriesString(int n) {
        if (n == 1) {
            return "1";
        } else {
            return getSeriesString(n - 1) + " + " + (2 * n - 1);
        }
    }
}
    