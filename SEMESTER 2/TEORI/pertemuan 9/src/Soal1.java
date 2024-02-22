import java.util.Scanner;

public class Soal1 {

     public static double getNilai(String namaNilai) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai " + namaNilai + " : ");
        return input.nextDouble();
    }

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static double hitungLuasBujurSangkar(double sisi) {
        return sisi * sisi;
    }

    public static double hitungLuasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double hitungLuasBola(double jariJari) {
        return 4 * Math.PI * jariJari * jariJari;
    }

    public static double hitungVolumeBola(double jariJari) {
        return (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("***********************************");
            System.out.println("PROGRAM HITUNG BANGUN RUANG part I");
            System.out.println("***********************************");
            System.out.println("1.  Luas Segitiga");
            System.out.println("2.  Luas Bujur Sangkar");
            System.out.println("3.  Luas Lingkaran");
            System.out.println("4.  Luas Persegi Panjang");
            System.out.println("5.  Luas Bola");
            System.out.println("6.  Volume Bola");
            System.out.println("0.  Keluar (pilih ini jika bosan)");
            System.out.print("Masukan Pilihan : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("PROGRAM LUAS SEGITIGA");
                    double alasSegitiga = getNilai("Alas");
                    double tinggiSegitiga = getNilai("Tinggi");
                    double luasSegitiga = hitungLuasSegitiga(alasSegitiga, tinggiSegitiga);
                    System.out.println("Luas dari Alas = " + alasSegitiga + " & Tinggi = " + tinggiSegitiga + " adalah " + luasSegitiga);
                    break;
                case 2:
                    System.out.println("PROGRAM LUAS BUJUR SANGKAR");
                    double sisi = getNilai("Panjang Sisi");
                    double luasBujurSangkar = hitungLuasBujurSangkar(sisi);
                    System.out.println("Luas dari Sisi = " + sisi + " adalah " + luasBujurSangkar);
                    break;
                case 3:
                    System.out.println("PROGRAM LUAS LINGKARAN");
                    double jariJari = getNilai("Jari-jari");
                    double luasLingkaran = hitungLuasLingkaran(jariJari);
                    System.out.println("Luas dengan Jari-jari = " + jariJari + " adalah " + luasLingkaran);
                    break;
                case 4:
                    System.out.println("PROGRAM LUAS PERSEGI PANJANG");
                    double panjang = getNilai("Panjang");
                    double lebar = getNilai("Lebar");
                    double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
                    System.out.println("Luas dengan Panjang = " + panjang + " & Lebar = " + lebar + " adalah " + luasPersegiPanjang);
                    break;
                case 5:
                    System.out.println("PROGRAM LUAS BOLA");
                    double jariJariBola = getNilai("Jari-jari");
                    double luasBola = hitungLuasBola(jariJariBola);
                    System.out.println("Luas dengan Jari-jari = " + jariJariBola + " adalah " + luasBola);
                    break;
                case 6:
                    System.out.println("PROGRAM VOLUME BOLA");
                    double jariJariBola2 = getNilai("Jari-jari");
                    double volumeBola = hitungVolumeBola(jariJariBola2);
                    System.out.println("Volume dengan Jari-jari = " + jariJariBola2 + " adalah " + volumeBola);
                    break;
                case 0:
                    System.out.println("Terima kasih sudah berhenti! Aku capek.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih angka antara 0-6.");
            }

            System.out.println();
        } while (pilihan != 0);

        input.close();
    }
   
}
