import java.util.Scanner;

class tipePointerP3C {
    String namaKota;
    tipePointerP3C kiri;
    tipePointerP3C kanan;
}

class belajarPointerP3C {
    public static void main(String[] args) {
        tipePointerP3C P;
        P = new tipePointerP3C();
        P.namaKota = "Yogyakarta";

        tipePointerP3C Q;
        Q = new tipePointerP3C();
        Q.namaKota = "Klaten";

        tipePointerP3C R;
        R = new tipePointerP3C();
        R.namaKota = "Solo";

        tipePointerP3C S;
        S = new tipePointerP3C();
        S.namaKota = "Sragen";

        tipePointerP3C T;
        T = new tipePointerP3C();
        T.namaKota = "Ngawi";

        P.kanan = Q;
        Q.kanan = R;
        R.kanan = S;
        S.kanan = T;
        T.kanan = null;

        P.kiri = null;
        Q.kiri = P;
        R.kiri = Q;
        S.kiri = R;
        T.kiri = S;

        System.out.println("Elemen namaKota untuk pointer P adalah :");
        System.out.println("----------------------------------------");
        System.out.println(P.namaKota);
        System.out.println(P.kanan.kiri.namaKota);
        System.out.println(P.kanan.kanan.kiri.kiri.namaKota);

        tipePointerP3C BANTU;
        BANTU = T;
        while (BANTU != null) {
            System.out.println("Nilai BANTU.namaKota adalah = " + BANTU.namaKota);
            BANTU = BANTU.kiri;
        }
    }
}
