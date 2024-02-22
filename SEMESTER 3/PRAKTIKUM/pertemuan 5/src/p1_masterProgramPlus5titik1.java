import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class p1_masterProgramPlus5titik1 {
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

    public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
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
        int T;
        System.out.print("Pada posisi ke berapa data akan dimasukkan ? : ");
        T = masukan.nextInt();
        for (int i = N - 1; i >= T; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }
        biodataMahasiswa[T] = biodataMahasiswaBaru;
        N++;
    }

    public static void tambahDataDiBelakang(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
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
        biodataMahasiswa[N] = biodataMahasiswaBaru;
        N++;
    }

    public static void hapusDataDiDepan(formatBiodata biodataMahasiswa[]) {
        for (int i = 0; i <= N - 2; i++) {
            biodataMahasiswa[i] = biodataMahasiswa[i + 1];
        }
        System.out.println("Proses menghapus data ke-0 selesai.");
        N--;
    }

    public static void hapusDataDiTengah(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);
        int T;
        System.out.print("Tuliskan posisi data yang akan dihapus : ");
        T = masukan.nextInt();
        for (int i = T; i <= N - 2; i++) {
            biodataMahasiswa[i] = biodataMahasiswa[i + 1];
        }
        System.out.println("Proses menghapus data ke-" + T + " selesai.");
        N--;
    }

    public static void hapusDataDiBelakang(formatBiodata biodataMahasiswa[]) {
        System.out.println("Proses menghapus data paling akhir selesai.");
        N--;
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

    public static void menukarData() {
        Scanner masukan = new Scanner(System.in);
        int indeks1, indeks2;

        System.out.print("Masukkan indeks data pertama yang ingin Anda tukar: ");
        indeks1 = masukan.nextInt();

        System.out.print("Masukkan indeks data kedua yang ingin Anda tukar: ");
        indeks2 = masukan.nextInt();

        if (indeks1 >= 0 && indeks1 < N && indeks2 >= 0 && indeks2 < N) {
            formatBiodata temp = biodataMahasiswa[indeks1];
            biodataMahasiswa[indeks1] = biodataMahasiswa[indeks2];
            biodataMahasiswa[indeks2] = temp;

            System.out.println("Data pada indeks " + indeks1 + " dan indeks " + indeks2 + " telah ditukar.");
        } else {
            System.out.println("Indeks yang dimasukkan tidak valid.");
        }
    }

    public static void editData() {
        Scanner masukan = new Scanner(System.in);
        int indeks;

        System.out.print("Masukkan indeks data yang ingin Anda edit: ");
        indeks = masukan.nextInt();

        if (indeks >= 0 && indeks < N) {
            formatBiodata biodata = biodataMahasiswa[indeks];

            System.out.print("Masukkan nama baru: ");
            biodata.nama = masukan.next();

            System.out.print("Masukkan alamat baru: ");
            biodata.alamat = masukan.next();

            System.out.print("Masukkan jenis kelamin baru (L/P): ");
            char jekel = masukan.next().charAt(0);
            if (jekel == 'L' || jekel == 'P') {
                biodata.jekel = jekel;
            } else {
                System.out.println("Jenis kelamin tidak valid. Menggunakan jenis kelamin sebelumnya.");
            }

            System.out.println("Data pada indeks " + indeks + " telah diubah.");
        } else {
            System.out.println("Indeks yang dimasukkan tidak valid.");
        }
    }

    public static void mencariDataLinear(formatBiodata biodataMahasiswa[]) {
        String kataKunci;
        int lokasi = -1;
        boolean statusKetemu = false;

        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan kata kunci pencarian : ");
        kataKunci = masukan.next();

        for (int i = 0; i < N; i++) {
            if (biodataMahasiswa[i].nama.equals(kataKunci)) {
                statusKetemu = true;
                lokasi = i;
                break;
            }
        }

        if (statusKetemu) {
            System.out.println("Data yang anda cari KETEMU di larik ke: " + lokasi);
            System.out.println("Detail Data:");
            System.out.println("Nama: " + biodataMahasiswa[lokasi].nama);
            System.out.println("Alamat: " + biodataMahasiswa[lokasi].alamat);
            System.out.println("Umur: " + biodataMahasiswa[lokasi].umur);
            System.out.println("Jenis Kelamin: " + biodataMahasiswa[lokasi].jekel);
            System.out.println("Hobi[0]: " + biodataMahasiswa[lokasi].hobi[0]);
            System.out.println("Hobi[1]: " + biodataMahasiswa[lokasi].hobi[1]);
            System.out.println("Hobi[2]: " + biodataMahasiswa[lokasi].hobi[2]);
            System.out.println("IPK: " + biodataMahasiswa[lokasi].ipk);
        } else {
            System.out.println("Maaf, nama yang anda cari tidak ditemukan.");
        }
    }

    public static void mencariDataBiner(formatBiodata biodataMahasiswa[]) {
        String kataKunci;
        int lokasi = -1;
        boolean statusKetemu = false;

        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan kata kunci pencarian : ");
        kataKunci = masukan.next();

        int atas, bawah, tengah;
        atas = 0;
        bawah = N - 1;
        tengah = (atas + bawah) / 2;

        while ((statusKetemu == false) && (bawah - atas != 1)) {
            if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) < 0) {
                bawah = tengah;
                tengah = (atas + bawah) / 2;
            } else if (kataKunci.compareTo(biodataMahasiswa[tengah].nama) > 0) {
                atas = tengah;
                tengah = (atas + bawah) / 2;
            } else {
                statusKetemu = true;
                lokasi = tengah;
            }
        }

        if (statusKetemu == true) {
            System.out.println("Data yang anda cari KETEMU di larik ke : " + lokasi);
        } else {
            System.out.println("maap, nama yang anda cari tidak ditemukan ");
        }
    }

    public static void mengurutkanDataBubble(formatBiodata biodataMahasiswa[]) {
        formatBiodata biodataSementara = new formatBiodata();
        int indeksTerakhir = N - 1;
        for (int j = 0; j <= indeksTerakhir - 1; j++) {
            for (int i = 0; i <= indeksTerakhir - 1 - j; i++) {
                if (biodataMahasiswa[i].nama.compareTo(biodataMahasiswa[i + 1].nama) > 0) {
                    biodataSementara = biodataMahasiswa[i];
                    biodataMahasiswa[i] = biodataMahasiswa[i + 1];
                    biodataMahasiswa[i + 1] = biodataSementara;

                }
            }
        }
        System.out.println("Data telah diurutkan berdasarkan nama.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Di Depan");
            System.out.println("2. Tambah Data Di Tengah");
            System.out.println("3. Tambah Data Di Belakang");
            System.out.println("4. Hapus Data Di Depan");
            System.out.println("5. Hapus Data Di Tengah");
            System.out.println("6. Hapus Data Di Belakang");
            System.out.println("7. Tampilkan Data");
            System.out.println("8. Keluar");
            System.out.println("9. Menukar Data");
            System.out.println("10. Edit Data");
            System.out.println("11. Cari Data (linear)");
            System.out.println("12. Cari Data (binary)");
            System.out.println("13. Urutkan Data (Bubble Sort)");
            System.out.print("Pilih menu (1-13): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    tambahDataDiDepan();
                    break;
                case 2:
                    tambahDataDiTengah(biodataMahasiswa);
                    break;
                case 3:
                    tambahDataDiBelakang(biodataMahasiswa);
                    break;
                case 4:
                    hapusDataDiDepan(biodataMahasiswa);
                    break;
                case 5:
                    hapusDataDiTengah(biodataMahasiswa);
                    break;
                case 6:
                    hapusDataDiBelakang(biodataMahasiswa);
                    break;
                case 7:
                    tampilkanData();
                    break;
                case 8:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                case 9:
                    menukarData();
                    break;
                case 10:
                    editData();
                    break;
                case 11:
                    mencariDataLinear(biodataMahasiswa);
                    break;
                case 12:
                    mencariDataBiner(biodataMahasiswa);
                    break;
                case 13:
                    mengurutkanDataBubble(biodataMahasiswa);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu (1-13).");
            }
        }
    }
}
