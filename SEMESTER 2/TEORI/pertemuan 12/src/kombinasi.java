import java.util.Scanner;

public class kombinasi {
    // Fungsi untuk menghitung faktorial
    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    // Fungsi untuk menghitung kombinasi tanpa pengulangan
    // C(n, r) = n! / (r! * (n - r)!)
    public static int kombinasiTanpaPengulangan(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
    }

    // Fungsi untuk menghitung kombinasi dengan pengulangan
    // C(n + r - 1, r) = (n + r - 1)! / (r! * (n - 1)!)
    public static int kombinasiDenganPengulangan(int n, int r) {
        return faktorial(n + r - 1) / (faktorial(r) * faktorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Kombinasi tanpa pengulangan");
        System.out.println("2. Kombinasi dengan pengulangan");
        System.out.print("Pilih menu (1/2): ");
        int menu = scanner.nextInt();

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.print("Masukkan nilai r: ");
        int r = scanner.nextInt();

        scanner.close();

        if (menu == 1) {
            // Kombinasi tanpa pengulangan
            int hasilKombinasiTanpaPengulangan = kombinasiTanpaPengulangan(n, r);
            System.out.println("Kombinasi tanpa pengulangan: " + hasilKombinasiTanpaPengulangan);
        } else if (menu == 2) {
            // Kombinasi dengan pengulangan
            int hasilKombinasiDenganPengulangan = kombinasiDenganPengulangan(n, r);
            System.out.println("Kombinasi dengan pengulangan: " + hasilKombinasiDenganPengulangan);
        } else {
            System.out.println("Pilihan menu tidak valid.");
        }
    }
}
