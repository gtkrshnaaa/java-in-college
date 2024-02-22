import java.util.Scanner;

public class p4_modp3 {
    public static int hitungJumlah(int[] x) {
        int jum = 0;
        for (int i = 0; i < x.length; i++) {
            jum += x[i];
        }
        return jum;
    }

    public static double hitungRataRata(int[] x) {
        int jumlah = hitungJumlah(x);
        double rataRata = (double) jumlah / x.length;
        return rataRata;
    }

    public static void main(String[] args) {
        int data[] = new int[10];
        double rataRata;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan data ke-" + (i + 1) + ":");
            data[i] = scan.nextInt();
        }
        rataRata = hitungRataRata(data);
        System.out.println("Rata-rata data = " + rataRata);
    }
}
