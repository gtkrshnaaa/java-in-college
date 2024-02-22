class simpul {
    String elemen;
    simpul kiri;
    simpul kanan;
}

class pohon {
    public static simpul akar;

    public static void deklarasiPohon() {
        akar = null;
    }

    static simpul tambahSimpul(simpul Penunjuk, String ELEMEN) {
        if (Penunjuk == null) {
            simpul baru = new simpul();
            baru.elemen = ELEMEN;
            baru.kiri = null;
            baru.kanan = null;
            Penunjuk = baru;
            return Penunjuk;
        } else {
            if (ELEMEN.compareTo(Penunjuk.elemen) < 0) {
                Penunjuk.kiri = tambahSimpul(Penunjuk.kiri, ELEMEN);
            } else {
                Penunjuk.kanan = tambahSimpul(Penunjuk.kanan, ELEMEN);
            }
            return Penunjuk;
        }
    }

    static void preOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            System.out.print(Penunjuk.elemen + ",");
            preOrder(Penunjuk.kiri);
            preOrder(Penunjuk.kanan);
        }
    }

    static void inOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            inOrder(Penunjuk.kiri);
            System.out.print(Penunjuk.elemen + ",");
            inOrder(Penunjuk.kanan);
        }
    }

    static void postOrder(simpul Penunjuk) {
        if (Penunjuk != null) {
            postOrder(Penunjuk.kiri);
            postOrder(Penunjuk.kanan);
            System.out.print(Penunjuk.elemen + ",");
        }
    }
}

public class p1_preordertree {
    public static void main(String[] args) {
        pohon.deklarasiPohon();

        pohon.akar = pohon.tambahSimpul(pohon.akar, "M");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "P");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "D");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "A");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "S");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "K");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "N");

        pohon.akar = pohon.tambahSimpul(pohon.akar, "G");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "O");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "L");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "W");

        pohon.akar = pohon.tambahSimpul(pohon.akar, "F");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "J");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "T");

        pohon.akar = pohon.tambahSimpul(pohon.akar, "H");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "U");

        System.out.println("Pre-Order");
        pohon.preOrder(pohon.akar);

        System.out.println();
    }
}
