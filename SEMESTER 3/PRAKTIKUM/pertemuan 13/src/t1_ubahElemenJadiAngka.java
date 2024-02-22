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

public class t1_ubahElemenJadiAngka {
    public static void main(String[] args) {
        pohon.deklarasiPohon();

        pohon.akar = pohon.tambahSimpul(pohon.akar, "13");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "16");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "4");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "1");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "19");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "11");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "14");
        
        pohon.akar = pohon.tambahSimpul(pohon.akar, "7");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "15");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "12");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "23");
        
        pohon.akar = pohon.tambahSimpul(pohon.akar, "6");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "10");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "20");
        
        pohon.akar = pohon.tambahSimpul(pohon.akar, "8");
        pohon.akar = pohon.tambahSimpul(pohon.akar, "21");
        

        System.out.println();

        System.out.println("Pre-Order");
        pohon.preOrder(pohon.akar);

        System.out.println();
        System.out.println();

        System.out.println("In-Order");
        pohon.inOrder(pohon.akar);

        System.out.println();
        System.out.println();

        System.out.println("Post-Order");
        pohon.postOrder(pohon.akar);

        System.out.println();
    }
}
