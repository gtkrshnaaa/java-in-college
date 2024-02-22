class tipePointer {
    String namaKota;
    tipePointer kanan;
}

class belajarPointerP3A {
    public static void main(String[] args) {
        tipePointer P;
        P = new tipePointer();
        P.namaKota = "Yogyakarta";

        tipePointer Q;
        Q = new tipePointer();
        Q.namaKota = "Klaten";

        tipePointer R;
        R = new tipePointer();
        R.namaKota = "Solo";

        tipePointer S;
        S = new tipePointer();
        S.namaKota = "Sragen";

        tipePointer T;
        T = new tipePointer();
        T.namaKota = "Ngawi";

        System.out.println("Nilai P, Q, R, S, T adalah :");
        System.out.println("------------------------");
        System.out.println("Nilai P.namaKota adalah = " + P.namaKota);
        System.out.println("Nilai Q.namaKota adalah = " + Q.namaKota);
        System.out.println("Nilai R.namaKota adalah = " + R.namaKota);
        System.out.println("Nilai S.namaKota adalah = " + S.namaKota);
        System.out.println("Nilai T.namaKota adalah = " + T.namaKota);

        P.kanan = Q;
        Q.kanan = R;
        R.kanan = S;
        S.kanan = T;
        T.kanan = null;

        System.out.println("Nilai-nilai yang dapat diakses dari pointer P adalah :");
        System.out.println("-----------------------------------------------------");
        System.out.println(P.namaKota);
        System.out.println(P.kanan.namaKota);
        System.out.println(P.kanan.kanan.namaKota);
        System.out.println(P.kanan.kanan.kanan.namaKota);
        System.out.println(P.kanan.kanan.kanan.kanan.namaKota);

        System.out.println(R.namaKota); 
        P.kanan.kanan.namaKota = "Surakarta"; 
        System.out.println(R.namaKota);
    }
}
