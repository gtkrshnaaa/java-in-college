import java.util.Scanner;

public class soalUTS2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan daftar provider dan kuota internetnya
        System.out.println("Pilih provider:");
        System.out.println("1. XX");
        System.out.println("2. YY");
        System.out.print("Masukkan pilihan: ");
        int provider = input.nextInt();

        System.out.println("\nPilih paket internet:");
        if (provider == 1) {
            System.out.println("1. HAPPY 10 GB");
            System.out.println("2. HAPPY 20 GB");
            System.out.println("3. UL 10 GB");
            System.out.println("4. UL 20 GB");
        } else if (provider == 2) {
            System.out.println("1. BAHAGIA 10 GB");
            System.out.println("2. BAHAGIA 20 GB");
            System.out.println("3. NONSTOP 10 GB");
            System.out.println("4. NONSTOP 20 GB");
        }
        System.out.print("Masukkan pilihan: ");
        int paket = input.nextInt();

        // Menentukan harga dan kuota sesuai dengan pilihan pengguna
        String namaProvider = "";
        String namaKuota = "";
        int harga = 0;
        if (provider == 1) {
            if (paket == 1) {
                namaProvider = "XX";
                namaKuota = "HAPPY 10 GB";
                harga = 50000;
            } else if (paket == 2) {
                namaProvider = "XX";
                namaKuota = "HAPPY 20 GB";
                harga = 90000;
            } else if (paket == 3) {
                namaProvider = "XX";
                namaKuota = "UL 10 GB";
                harga = 55000;
            } else if (paket == 4) {
                namaProvider = "XX";
                namaKuota = "UL 20 GB";
                harga = 100000;
            }
        } else if (provider == 2) {
            if (paket == 1) {
                namaProvider = "YY";
                namaKuota = "BAHAGIA 10 GB";
                harga = 60000;
            } else if (paket == 2) {
                namaProvider = "YY";
                namaKuota = "BAHAGIA 20 GB";
                harga = 110000;
            } else if (paket == 3) {
                namaProvider = "YY";
                namaKuota = "NONSTOP 10 GB";
                harga = 65000;
            } else if (paket == 4) {
                namaProvider = "YY";
                namaKuota = "NONSTOP 20 GB";
                harga = 115000;
            }
        }

        // Menampilkan provider, kuota, dan harga yang dipilih
        System.out.println("\nAnda memilih:");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|   Provider   |        Kuota         |     Harga     |");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("|     %s       |     %-17s|     %-8d  |\n", namaProvider, namaKuota, harga);
        System.out.println("-----------------------------------------------------------");
    }
}








