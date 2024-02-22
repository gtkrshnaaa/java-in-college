import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private double nilai;

    public Mahasiswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }
    
}

public class tugasPertemuan2 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di program gilang, arya, dan reffy.");
        System.out.print("Silahkan masukkan jumlah mahasiswa yang ingin dimanipulasi datanya : ");
        int jumlahMahasiswa = input.nextInt();

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            String nama = input.next();
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            double nilai = input.nextDouble();
            daftarMahasiswa.add(new Mahasiswa(nama, nilai));
        }

        boolean lanjut = true;

        while (lanjut) {
            System.out.println("\nPilih fitur:");
            System.out.println("1. Menambah Data Mahasiswa Baru");
            System.out.println("2. Menampilkan Data Mahasiswa");
            System.out.println("3. Mengurutkan Nilai Mahasiswa");
            System.out.println("4. Menghitung Nilai Total dan Rata-Rata Kelas");
            System.out.println("5. Menghitung Nilai Tertinggi dan Terendah Mahasiswa");
            System.out.println("6. Mencari Mahasiswa dengan Nilai Tertinggi");
            System.out.println("7. Menghapus Data Mahasiswa");
            System.out.println("8. Keluar");

            System.out.print("Masukkan nomor fitur : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan nama mahasiswa baru: ");
                    String namaBaru = input.next();
                    System.out.print("Masukkan nilai mahasiswa baru: ");
                    double nilaiBaru = input.nextDouble();
                    daftarMahasiswa.add(new Mahasiswa(namaBaru, nilaiBaru));
                    System.out.println("Data mahasiswa baru telah ditambahkan. Silahkan gunakan fitur nomor 2 untuk menampilkan data.");
                    break;
                case 2:
                    System.out.println("\nData Mahasiswa:");
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        System.out.println("Nama: " + mahasiswa.getNama() + ", Nilai: " + mahasiswa.getNilai());
                    }
                    break;
                case 3:
                    Collections.sort(daftarMahasiswa, (m1, m2) -> Double.compare(m1.getNilai(), m2.getNilai()));
                    System.out.println("\nData Mahasiswa telah diurutkan berdasarkan nilai. Silahkan gunakan fitur nomor 2 untuk menampilkan data.");
                    break;
                case 4:
                    double total = 0;
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        total += mahasiswa.getNilai();
                    }
                    double rataRata = total / daftarMahasiswa.size();
                    System.out.println("\nTotal Nilai Kelas: " + total);
                    System.out.println("Rata-Rata Nilai Kelas: " + rataRata);
                    break;
                case 5:
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("\nDaftar mahasiswa kosong.");
                    } else {
                        double nilaiTertinggi = daftarMahasiswa.get(0).getNilai();
                        double nilaiTerendah = daftarMahasiswa.get(0).getNilai();

                        for (Mahasiswa mahasiswa : daftarMahasiswa) {
                            double nilaiMahasiswa = mahasiswa.getNilai();
                            if (nilaiMahasiswa > nilaiTertinggi) {
                                nilaiTertinggi = nilaiMahasiswa;
                            }
                            if (nilaiMahasiswa < nilaiTerendah) {
                                nilaiTerendah = nilaiMahasiswa;
                            }
                        }

                        System.out.println("\nNilai Tertinggi: " + nilaiTertinggi);
                        System.out.println("Nilai Terendah: " + nilaiTerendah);
                    }
                    break;
                case 6:
                    if (daftarMahasiswa.isEmpty()) {
                        System.out.println("\nDaftar mahasiswa kosong.");
                    } else {
                        double nilaiTertinggi = daftarMahasiswa.get(0).getNilai();
                        String mahasiswaTertinggi = daftarMahasiswa.get(0).getNama();

                        for (Mahasiswa mahasiswa : daftarMahasiswa) {
                            double nilaiMahasiswa = mahasiswa.getNilai();
                            if (nilaiMahasiswa > nilaiTertinggi) {
                                nilaiTertinggi = nilaiMahasiswa;
                                mahasiswaTertinggi = mahasiswa.getNama();
                            }
                        }

                        System.out.println("\nMahasiswa dengan Nilai Tertinggi: " + mahasiswaTertinggi);
                    }
                    break;
                case 7:
                    System.out.print("\nMasukkan nama mahasiswa yang ingin dihapus: ");
                    String namaHapus = input.next();
                    boolean ditemukan = false;
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        if (mahasiswa.getNama().equals(namaHapus)) {
                            daftarMahasiswa.remove(mahasiswa);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (ditemukan) {
                        System.out.println("Data mahasiswa dengan nama '" + namaHapus + "' telah dihapus. Silahkan gunakan fitur nomor 2 untuk menampilkan data.");
                    } else {
                        System.out.println("Data mahasiswa dengan nama '" + namaHapus + "' tidak ditemukan.");
                    }
                    break;
                case 8:
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            if (lanjut) {
                System.out.print("Apakah Anda ingin melanjutkan? (ya/tidak): ");
                String jawaban = input.next();
                lanjut = jawaban.equalsIgnoreCase("ya");
            }
        }

        System.out.println("Terima kasih telah menggunakan program ini!");
    }
}
