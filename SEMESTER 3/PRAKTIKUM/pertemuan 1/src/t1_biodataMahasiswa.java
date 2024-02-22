import java.util.Scanner;

public class t1_biodataMahasiswa {
    public static void main(String[] args) {
        int jumlahMahasiswa = 5; // Jumlah mahasiswa yang akan dimasukkan biodatanya
        Scanner masukan = new Scanner(System.in);

        // Deklarasi array untuk menyimpan biodata mahasiswa
        String[] nama = new String[jumlahMahasiswa];
        String[] alamat = new String[jumlahMahasiswa];
        int[] umur = new int[jumlahMahasiswa];
        char[] jenisKelamin = new char[jumlahMahasiswa];
        String[][] hobi = new String[jumlahMahasiswa][3];
        float[] ipk = new float[jumlahMahasiswa];

        // Loop untuk menginput biodata masing-masing mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan biodata mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            nama[i] = masukan.next();
            System.out.print("Alamat: ");
            alamat[i] = masukan.next();
            System.out.print("Umur: ");
            umur[i] = masukan.nextInt();
            System.out.print("Jenis Kelamin (L/P): ");
            jenisKelamin[i] = masukan.next().charAt(0);
            System.out.println("Masukkan hobi (maks 3): ");
            for (int j = 0; j < 3; j++) {
                System.out.print("Hobi ke-" + j + ": ");
                hobi[i][j] = masukan.next();
            }
            System.out.print("IPK: ");
            ipk[i] = masukan.nextFloat();
        }

        // Cetak biodata masing-masing mahasiswa
        System.out.println("Biodata Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + nama[i]);
            System.out.println("Alamat: " + alamat[i]);
            System.out.println("Umur: " + umur[i]);
            System.out.println("Jenis Kelamin: " + jenisKelamin[i]);
            System.out.println("Hobi: ");
            for (int j = 0; j < 3; j++) {
                System.out.println("  Hobi ke-" + j + ": " + hobi[i][j]);
            }
            System.out.println("IPK: " + ipk[i]);
            System.out.println();
        }

        // Tutup objek Scanner
        masukan.close();
    }
}
