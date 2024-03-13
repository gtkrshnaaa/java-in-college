import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private String alamat;
    private double nilai;

    public Mahasiswa(String nama, String alamat, double nilai) {
        this.nama = nama;
        this.alamat = alamat;
        this.nilai = nilai;
    }

    public void tampilInformasi() {
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Nilai: " + nilai);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getNilai() {
        return nilai;
    }
}

public class Latihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan informasi mahasiswa:");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Nilai: ");
        double nilai = input.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(nama, alamat, nilai);
        mahasiswa.tampilInformasi();
    }
}
