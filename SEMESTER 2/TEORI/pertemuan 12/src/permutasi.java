import java.util.Scanner;

public class permutasi {
    // Fungsi untuk menghitung faktorial
    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    // Fungsi untuk menghitung permutasi tanpa pengulangan
    // P(n, r) = n! / (n - r)!
    public static int permutasiTanpaPengulangan(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }

    // Fungsi untuk menghitung permutasi dengan pengulangan
    // P(n1, n2, ..., nk) = n! / (n1! * n2! * ... * nk!)
    public static int permutasiDenganPengulangan(int[] jumlahs) {
        int totalObjek = 0;
        int penyebut = 1;
        for (int jumlah : jumlahs) {
            totalObjek += jumlah;
            penyebut *= faktorial(jumlah);
        }
        return faktorial(totalObjek) / penyebut;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Permutasi tanpa pengulangan");
        System.out.println("2. Permutasi dengan pengulangan");
        System.out.print("Pilih menu (1/2): ");
        int menu = scanner.nextInt();

        if (menu == 1) {
            System.out.print("Masukkan nilai n: ");
            int n = scanner.nextInt();

            System.out.print("Masukkan nilai r: ");
            int r = scanner.nextInt();

            // Permutasi tanpa pengulangan
            int hasilPermutasiTanpaPengulangan = permutasiTanpaPengulangan(n, r);
            System.out.println("Permutasi tanpa pengulangan: " + hasilPermutasiTanpaPengulangan);
        } else if (menu == 2) {
            System.out.print("Masukkan jumlah objek tipe yang berbeda: ");
            int jumlahObjekTipeBerbeda = scanner.nextInt();

            int[] jumlahs = new int[jumlahObjekTipeBerbeda];
            for (int i = 0; i < jumlahObjekTipeBerbeda; i++) {
                System.out.print("Masukkan jumlah objek tipe ke-" + (i + 1) + ": ");
                jumlahs[i] = scanner.nextInt();
            }

            // Permutasi dengan pengulangan
            int hasilPermutasiDenganPengulangan = permutasiDenganPengulangan(jumlahs);
            System.out.println("Permutasi dengan pengulangan: " + hasilPermutasiDenganPengulangan);
        } else {
            System.out.println("Pilihan menu tidak valid.");
        }

        scanner.close();
    }
}
