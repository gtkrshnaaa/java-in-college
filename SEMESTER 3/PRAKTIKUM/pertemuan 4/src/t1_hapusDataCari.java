import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class t1_hapusDataCari {
    public static int N = 0;
    public static formatBiodata biodataMahasiswa[] = new formatBiodata[10];

    public static void tambahDataDiDepan() {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        formatBiodata biodataMahasiswaBaru = new formatBiodata();

        System.out.print("Silakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.next();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();

        for (int i = N - 1; i >= 0; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }

        biodataMahasiswa[0] = biodataMahasiswaBaru;
        N++;
        System.out.println("Data telah ditambahkan di depan.");
    }

    public static void tampilkanData() {
        System.out.println("-------------------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < N; i++) {
            System.out.print(i + ".");
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("-------------------------------------------------------");
    }

    public static void hapusData(String nama) {
        int indexDihapus = -1;

        for (int i = 0; i < N; i++) {
            if (biodataMahasiswa[i].nama.equals(nama)) {
                indexDihapus = i;
                break;
            }
        }

        if (indexDihapus != -1) {
            for (int i = indexDihapus; i < N - 1; i++) {
                biodataMahasiswa[i] = biodataMahasiswa[i + 1];
            }

            N--;
            System.out.println("Data dengan nama " + nama + " telah dihapus.");
        } else {
            System.out.println("Data dengan nama " + nama + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Di Depan");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Hapus Data Berdasarkan Nama");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahDataDiDepan();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Masukkan nama yang akan dihapus: ");
                    String nama = scanner.nextLine();
                    hapusData(nama);
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu (1-4).");
            }
        }
    }
}
