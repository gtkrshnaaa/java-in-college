import java.util.Scanner;

class tipePointerA {
    int angka;
    String teks;
}

class belajarPointerP2A {
    public static void main(String[] args) {
        tipePointerA P;
        P = new tipePointerA();
        P.angka = 100;
        P.teks = "Halo";

        tipePointerA Q = new tipePointerA();
        Q.angka = 200;
        Q.teks = "Akakom";

        System.out.println("Nilai elemen P dan Q adalah :");
        System.out.println("-----------------------------");
        System.out.println("Nilai P.angka adalah = " + P.angka);
        System.out.println("Nilai P.teks adalah = " + P.teks);
        System.out.println("Nilai Q.angka adalah = " + Q.angka);
        System.out.println("Nilai Q.teks adalah = " + Q.teks);
    }
}
