import java.util.Scanner;

public class t1_modl1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] data = new double[10];
        char[] keluar = new char[10];
        int i = 0;
        while (i < 10) {
            System.out.print("Data ke-" + (i + 1) + ": ");
            data[i] = scan.nextDouble();
            i++;
        }
        System.out.println("=====================");
        System.out.println("|   Hasil Konversi  |");
        System.out.println("=====================");
        keluar = konversiNilai(data);
        // tampil hasil
        i = 0;
        while (i < 10) {
            System.out.println(data[i] + " " + keluar[i]);
            i++;
        }
    }

    public static char[] konversiNilai(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];
        int i = 0;
        while (i < n) {
            double nilai = x[i];
            switch ((int) nilai / 20) {
                case 5:
                    hasil[i] = 'A';
                    break;
                case 4:
                    hasil[i] = 'B';
                    break;
                case 3:
                    hasil[i] = 'C';
                    break;
                case 2:
                    hasil[i] = 'D';
                    break;
                default:
                    hasil[i] = 'E';
            }
            i++;
        }
        return hasil;
    }
}
