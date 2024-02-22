import java.util.Scanner;

class tipePointerC {
    int angka;
    String teks;
}

class belajarPointerP2C {
    public static void main(String[] args) {
        tipePointerC P = new tipePointerC();
        P.angka = 100;
        P.teks = "Halo";

        tipePointerC Q = new tipePointerC();
        Q.angka = 200;
        Q.teks = "Akakom";

        System.out.println("Nilai P dan Q sebelum pointer dimanipulasi :");
        System.out.println("--------------------------------------------");
        System.out.println("Nilai P.angka adalah = " + P.angka);
        System.out.println("Nilai P.teks adalah = " + P.teks);

        System.out.println("Nilai Q.angka adalah = " + Q.angka);
        System.out.println("Nilai Q.teks adalah = " + Q.teks);

        tipePointerC R;
        R = P;
        P = Q;
        Q = R;

        System.out.println("Nilai P dan Q setelah pointer dimanipulasi :");
        System.out.println("--------------------------------------------");
        System.out.println("Nilai P.angka adalah = " + P.angka);
        System.out.println("Nilai P.teks adalah = " + P.teks);

        System.out.println("Nilai Q.angka adalah = " + Q.angka);
        System.out.println("Nilai Q.teks adalah = " + Q.teks);
    }
}
