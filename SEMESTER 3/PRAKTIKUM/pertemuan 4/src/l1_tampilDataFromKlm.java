import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class l1_tampilDataFromKlm {
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
        System.out.print("Silakan masukkan Jenis Kelamin anda (L/P) : ");
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

    public static void tampilkanData(String syarat) {
        System.out.println("-------------------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < N; i++) {
            if (syarat.equalsIgnoreCase("all") || syarat.equalsIgnoreCase(String.valueOf(biodataMahasiswa[i].jekel))) {
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
        }
        System.out.println("-------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Di Depan");
            System.out.println("2. Tampilkan Data (all)");
            System.out.println("3. Tampilkan Data (berdasarkan jenis kelamin)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahDataDiDepan();
                    break;
                case 2:
                    tampilkanData("all");
                    break;
                case 3:
                    System.out.print("Masukkan jenis kelamin (L/P): ");
                    String jenisKelamin = scanner.next();
                    tampilkanData(jenisKelamin);
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
