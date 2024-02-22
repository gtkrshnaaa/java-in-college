import java.util.Scanner;

class formatBiodata { // bagian deklarasi struktur record ----------------------------------
    int nim;
    String nama;
    String alamat;
    int umur;
    char jekel;
    float ipk;
}

class p3_hashingModP2 {
    public static int N = 5;

    public static int hitungNilaiHash(int nilaiAwal) {
        int hasil;
        hasil = nilaiAwal % 997;
        return (hasil);
    }

    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        N = 1000;
        int NH;
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        // bagian menentukan banyaknya data yang akan dientri --------------
        System.out.print("Berapa data yang akan dientri ? : ");
        int banyakEntri = masukan.nextInt();
        // bagian entri data baru
        formatBiodata biodataMahasiswaBaru;
        for (int i = 0; i <= banyakEntri - 1; i++) {
            // bagian entri data baru ke penyimpan sementara --------------------
            biodataMahasiswaBaru = new formatBiodata();
            System.out.print("Silakan masukkan NIM anda : ");
            biodataMahasiswaBaru.nim = masukan.nextInt();
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
            System.out.print("Silakan masukkan IPK anda : ");
            biodataMahasiswaBaru.ipk = masukan.nextFloat();
            // bagian memindahkan data baru ke larik sesuai nilai Hashing -----
            NH = hitungNilaiHash(biodataMahasiswaBaru.nim);

            // Mengatasi COllISION
            while (biodataMahasiswa[NH].nama != null) {
                System.out.println("terjadi tabrakan pada NH = " + NH);
                NH++;
            }

            System.out.println("Biodata " + biodataMahasiswaBaru.nama + " akan ditempatkan pada larik ke : " + NH);
            biodataMahasiswa[NH] = biodataMahasiswaBaru;
        }
    }

    public static void berhentiSebentar() {
        System.out.println("");
        System.out.println("Tekan tombol ENTER untuk melanjutkan.. ");
        Scanner masukan = new Scanner(System.in);
        int bacaTombol;
        do {
            bacaTombol = 0;
            try {
                bacaTombol = System.in.read();
            } catch (java.io.IOException e) {
            }
        } while (bacaTombol != 13); // tombol 13 adalah tombol enter
    }

    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        // bagian menampilkan isi struktur Larik --------------------------
        System.out.println(" ");
        System.out.println("NO NAMA ALAMAT UMUR JEKEL IPK ");
        System.out.println(" ");
        for (int i = 0; i <= N - 1; i++) {
            System.out.print(i + " ");
            System.out.print(biodataMahasiswa[i].nama + "\t ");
            System.out.print(biodataMahasiswa[i].alamat + "\t ");
            System.out.print(biodataMahasiswa[i].umur + "\t ");
            System.out.print(biodataMahasiswa[i].jekel + "\t ");
            System.out.println(biodataMahasiswa[i].ipk);
            if (i % 100 == 0)
                berhentiSebentar();
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // bagian deklarasi record berbasis LARIK -----------------------
        formatBiodata biodataMahasiswa[] = new formatBiodata[1000];
        for (int i = 0; i <= 999; i++)
            biodataMahasiswa[i] = new formatBiodata();
        // pemanggilan fungsi-fungsi
        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
}