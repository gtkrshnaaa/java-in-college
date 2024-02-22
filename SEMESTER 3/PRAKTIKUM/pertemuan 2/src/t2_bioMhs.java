import java.util.Scanner;

public class t2_bioMhs {
    static class Mahasiswa {
        String nama;
        String noMhs;
        double nilaiUTS;
        double nilaiUAS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int MAX_MAHASISWA = 100;

        Mahasiswa[] mahasiswaArray = new Mahasiswa[MAX_MAHASISWA];

        int jumlahMahasiswa = 0;

        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. Input");
            System.out.println("2. View");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    if (jumlahMahasiswa < MAX_MAHASISWA) {
                        Mahasiswa mahasiswa = new Mahasiswa();
                        System.out.println();
                        System.out.print("Nama: ");
                        mahasiswa.nama = input.next();
                        System.out.print("Nomor Mahasiswa: ");
                        mahasiswa.noMhs = input.next();
                        System.out.print("Nilai UTS: ");
                        mahasiswa.nilaiUTS = input.nextDouble();
                        System.out.print("Nilai UAS: ");
                        mahasiswa.nilaiUAS = input.nextDouble();
                        System.out.println();

                        mahasiswaArray[jumlahMahasiswa] = mahasiswa;
                        jumlahMahasiswa++;
                    } else {
                        System.out.println("Maaf, kapasitas sudah penuh.");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Daftar Biodata Mahasiswa:");
                    System.out.println();
                    for (int i = 0; i < jumlahMahasiswa; i++) {
                        Mahasiswa mahasiswa = mahasiswaArray[i];
                        System.out.println("Mahasiswa ke-" + (i + 1));
                        System.out.println("Nama: " + mahasiswa.nama);
                        System.out.println("Nomor Mahasiswa: " + mahasiswa.noMhs);
                        System.out.println("Nilai UTS: " + mahasiswa.nilaiUTS);
                        System.out.println("Nilai UAS: " + mahasiswa.nilaiUAS);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        } while (pilihan != 3);

        input.close();
    }
}
