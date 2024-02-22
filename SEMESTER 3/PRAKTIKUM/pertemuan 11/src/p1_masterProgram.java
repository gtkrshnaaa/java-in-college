import java.util.Scanner;

// bagian deklarasi struktur record ------------------------------
class simpulP11 {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
    public simpulP11 kiri;
    public simpulP11 kanan;
}

class SortingSearchingDiLinkedListP11Prak1 {
    public static simpulP11 awal;
    public static simpulP11 akhir;

    public static void inisialisasiSenaraiKosong() {
        awal = null;
        akhir = null;
    }

    // ------------bagian entri data dari keyboard--------------
    public static void tambahDepan() {
        String NAMA;
        String ALAMAT;
        int UMUR;
        int bacaTombol = 0;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;

        Scanner masukan = new Scanner(System.in);

        System.out.println("TAMBAH DEPAN : ");
        System.out.print("Silakan masukkan nama anda : ");
        NAMA = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        ALAMAT = masukan.nextLine();
        System.out.print("Silakan masukkan umur anda : ");
        UMUR = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");

        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        JEKEL = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        HOBI[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        HOBI[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        HOBI[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        IPK = masukan.nextFloat();
        // ------------bagian menciptakan & mengisi simpulP11 baru--------------
        simpulP11 baru;
        baru = new simpulP11();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;
        // --------bagian mencangkokkan simpulP11 baru ke dalam simpulP11 lama---------
        if (awal == null) // jika senarai kosong
        {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        } else // jika senarai tidak kosong
        {
            baru.kiri = akhir;
            akhir.kanan = baru;
            akhir = baru;
            akhir.kanan = null;
        }
    }

    public static void tambahBelakang() {
        // ------------bagian entri data dari keyboard--------------
        String NAMA;
        String ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        System.out.println("TAMBAH BELAKANG : ");
        System.out.print("Silakan masukkan nama anda : ");
        NAMA = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        ALAMAT = masukan.nextLine();
        System.out.print("Silakan masukkan umur anda : ");
        UMUR = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        JEKEL = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        HOBI[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        HOBI[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        HOBI[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        IPK = masukan.nextFloat();
        // ------------bagian menciptakan & mengisi simpulP11 baru--------------
        simpulP11 baru;
        baru = new simpulP11();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;
        // --------bagian mencangkokkan simpulP11 baru ke dalam simpulP11 lama---------
        if (awal == null) // jika senarai kosong
        {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        } else // jika senarai tidak kosong
        {
            baru.kiri = akhir;
            akhir.kanan = baru;
            akhir = baru;
            akhir.kanan = null;
        }
    }

    public static int hitungJumlahSimpulP11() {
        int N = 0;
        simpulP11 bantu;
        bantu = awal;
        while (bantu != null) {
            N++;
            bantu = bantu.kanan;
        }
        return (N);
    }

    public static void tambahTengah() {
        // ------------bagian menentukan lokasi target--------------
        Scanner masukan = new Scanner(System.in);
        System.out.println("Tentukan Lokasi Penambahan Data");
        int LOKASI = masukan.nextInt();
        int jumlahSimpulP11YangAda = hitungJumlahSimpulP11();
        if (LOKASI == 1)
            System.out.println("Lakukan penambahan di depan");
        else if (LOKASI > jumlahSimpulP11YangAda)
            System.out.println("Lakukan penambahan di belakang");
        else { // ------------bagian entri data dari keyboard--------------
            String NAMA;
            String ALAMAT;
            int UMUR;
            char JEKEL;
            String HOBI[] = new String[3];
            float IPK;
            // Scanner masukan = new Scanner(System.in);
            int bacaTombol = 0;
            System.out.println("TAMBAH TENGAH : ");
            System.out.print("Silakan masukkan nama anda : ");
            NAMA = masukan.next();
            System.out.print("Silakan masukkan alamat anda : ");
            ALAMAT = masukan.next();
            System.out.print("Silakan masukkan umur anda : ");
            UMUR = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda : ");
            try {
                bacaTombol = System.in.read();
            } catch (java.io.IOException e) {
            }
            JEKEL = (char) bacaTombol;
            System.out.println("Silakan masukkan hobi (maks 3) : ");
            System.out.print("hobi ke-0 : ");
            HOBI[0] = masukan.next();
            System.out.print("hobi ke-1 : ");
            HOBI[1] = masukan.next();
            System.out.print("hobi ke-2 : ");
            HOBI[2] = masukan.next();
            System.out.print("Silakan masukkan IPK anda : ");
            IPK = masukan.nextFloat();
            // ------------bagian menemukan posisi yang dikehendaki-----------
            simpulP11 bantu;
            bantu = awal;
            int i = 1;
            while ((i < LOKASI) && (bantu != akhir)) {
                bantu = bantu.kanan;
                i++;
            }
            // ------------bagian menciptakan & mengisi simpulP11 baru-----------
            simpulP11 baru = new simpulP11();
            baru.nama = NAMA;
            baru.alamat = ALAMAT;
            baru.umur = UMUR;
            baru.jekel = JEKEL;
            baru.hobi[0] = HOBI[0];
            baru.hobi[1] = HOBI[1];
            baru.hobi[2] = HOBI[2];
            baru.ipk = IPK;
            // ------bagian mencangkokkan simpulP11 baru ke dalam linkedlist lama------
            baru.kiri = bantu.kiri;
            baru.kiri.kanan = baru;
            baru.kanan = bantu;
            bantu.kiri = baru;
        }
    }

    public static void hapus() {
        if (awal == null) // jika senarai masih kosong
        {
            System.out.println("senarai kosong, menghapus tidak dapat dilakukan");
        } else // jika senarai tidak kosong
        {
            Scanner masukan = new Scanner(System.in);
            System.out.print("Silakan masukkan nama yang ingin dihapus : ");
            String NAMACARI = masukan.nextLine();
            if (awal == akhir) // jika hanya ada sebuah simpulP11
            {
                if (awal.nama.equals(NAMACARI)) {
                    System.out.println("menghapus " + NAMACARI + " dilakukan..");
                    inisialisasiSenaraiKosong();
                } else
                    System.out.println("data " + NAMACARI + " tidak ditemukan");
            } else if (awal.nama.equals(NAMACARI))// jika nama ditemukan di awal
            {
                System.out.println("menghapus " + NAMACARI + " dilakukan..");
                awal = awal.kanan;
                awal.kiri = null;
            } else {
                simpulP11 bantu;
                bantu = awal.kanan;
                while (bantu.nama.equals(NAMACARI) == false) {
                    bantu = bantu.kanan;
                    if (bantu.kanan == null)
                        break;
                }
                if ((bantu == akhir) && (akhir.nama.equals(NAMACARI) == false)) {
                    System.out.println("data " + NAMACARI + " tidak ditemukan");
                } else if (akhir.nama.equals(NAMACARI))// jika nama ditemukan di akhir
                {
                    akhir = bantu.kiri;
                    akhir.kanan = null;
                } else {
                    System.out.println("menghapus " + NAMACARI + " dilakukan..");
                    bantu.kanan.kiri = bantu.kiri;
                    bantu.kiri.kanan = bantu.kanan;
                }
            }
        }
    }

    public static void cetakSenaraiMaju() {
        if (awal == null) // jika senarai masih kosong
            System.out.print("....MAAF SENARAI KOSONG....");
        else // jika senarai tidak kosong
        {
            System.out.println(" ");
            System.out.println("NO NAMA ALAMAT UMUR JEKEL IPK ");
            System.out.println("");

            simpulP11 bantu;
            bantu = awal;
            while (bantu != null) {
                System.out.print(bantu.nama + "\t ");
                System.out.print(bantu.alamat + "\t ");
                System.out.print(bantu.umur + "\t ");
                System.out.print(bantu.jekel + "\t ");
                System.out.print(bantu.hobi[0] + "\t ");
                System.out.print(bantu.hobi[1] + "\t ");
                System.out.print(bantu.hobi[2] + "\t ");
                System.out.println(bantu.ipk);
                bantu = bantu.kanan;
            }
            System.out.println(" ");
        }
    }

    public static void cetakSenaraiMundur() {
        if (awal == null) // jika senarai masih kosong
            System.out.print("....MAAF SENARAI KOSONG....");
        else // jika senarai tidak kosong
        {
            System.out.println(" ");
            System.out.println("NO NAMA ALAMAT UMUR JEKEL IPK ");
            System.out.println("");

            simpulP11 bantu;
            bantu = akhir;
            while (bantu != null) {
                System.out.print(bantu.nama + "\t ");
                System.out.print(bantu.alamat + "\t ");
                System.out.print(bantu.umur + "\t ");
                System.out.print(bantu.jekel + "\t ");
                System.out.print(bantu.hobi[0] + "\t ");
                System.out.print(bantu.hobi[1] + "\t ");
                System.out.print(bantu.hobi[2] + "\t ");
                System.out.println(bantu.ipk);
                bantu = bantu.kiri;
            }
            System.out.println(" ");
        }
    }

    public static void tukarNilai(simpulP11 X, simpulP11 Y) {
        simpulP11 sementara = new simpulP11();
        sementara.nama = X.nama;
        sementara.alamat = X.alamat;
        sementara.umur = X.umur;
        sementara.jekel = X.jekel;
        sementara.ipk = X.ipk;
        X.nama = Y.nama;
        X.alamat = Y.alamat;
        X.umur = Y.umur;
        X.jekel = Y.jekel;
        X.ipk = Y.ipk;
        Y.nama = sementara.nama;
        Y.alamat = sementara.alamat;
        Y.umur = sementara.umur;
        Y.jekel = sementara.jekel;
        Y.ipk = sementara.ipk;
    }

    //
    // bisa untuk single LL dan double LL
    //
    public static void mengurutkanDataBubble_TeknikTukarNilai() {
        int N = hitungJumlahSimpulP11();
        simpulP11 A = null;
        simpulP11 B = null;
        simpulP11 berhenti = akhir.kanan;
        System.out.println("Banyaknya simpulP11 = " + hitungJumlahSimpulP11());
        for (int i = 1; i <= hitungJumlahSimpulP11() - 1; i++) {
            A = awal;
            B = awal.kanan;
            int nomor = 1;
            while (B != berhenti) {
                if (A.nama.compareTo(B.nama) > 0) {
                    // tukarkan elemen dari simpulP11 A dan elemen dari simpulP11 B
                    tukarNilai(A, B);
                }
                A = A.kanan;
                B = B.kanan;
                nomor++;
            }
            berhenti = A;
        }
        System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI======");
    }

    public static void mengurutkanDataBubble_TeknikTukarHeapSingleLinkedList() {
        int N = hitungJumlahSimpulP11();
        simpulP11 A = null;
        simpulP11 B = null;
        simpulP11 bantu = null;
        simpulP11 berhenti = akhir.kanan;
        int nomor;
        System.out.println("Banyaknya simpulP11 = " + hitungJumlahSimpulP11());
        for (int i = 1; i <= hitungJumlahSimpulP11() - 1; i++)
        // for (int i=1; i<= 4; i++)
        {
            A = awal;
            B = awal.kanan;
            nomor = 1;
            // proses banding-tukar, khusus simpulP11 pertama dgn sebelahnya
            if (A.nama.compareTo(B.nama) > 0) {
                A.kanan = B.kanan;
                B.kanan = A;
                awal = B;
            }
            // proses banding-tukar, simpulP11 kedua dgn sebelahnya, dst
            nomor++;
            bantu = awal;
            while (bantu.kanan.kanan != berhenti) {
                A = bantu.kanan;
                B = bantu.kanan.kanan;
                if (A.nama.compareTo(B.nama) > 0) {
                    // tukarkan simpulP11 A dan simpulP11 B
                    A.kanan = B.kanan;
                    B.kanan = A;
                    bantu.kanan = B;
                    if (B == akhir)
                        akhir = A;
                }
                bantu = bantu.kanan;
                nomor++;
            }
            berhenti = bantu.kanan;
            ;
            System.out.println("");
        }
        System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI======");
    }

    public static void mengurutkanDataBubble_TeknikTukarHeapDoubleLinkedList() {
        int N = hitungJumlahSimpulP11();
        simpulP11 bantu = awal;
        System.out.println("Banyaknya simpulP11 = " + hitungJumlahSimpulP11());
        for (int i = 1; i <= hitungJumlahSimpulP11(); i++) {
            // khusus menguji simpulP11 pertama dgn sebelahnya
            if (awal.nama.compareTo(awal.kanan.nama) > 0) {
                bantu = awal.kanan;
                awal.kanan = bantu.kanan;
                bantu.kanan.kiri = awal;
                bantu.kanan = awal;
                bantu.kiri = null;
                awal.kiri = bantu;
                awal = bantu;
            }
            // khusus menguji simpulP11 kedua dgn sebelahnya, simpulP11 ketiga dgnsebelahnya,dst,
            bantu = awal;
            while (bantu.kanan != akhir) {
                simpulP11 A = bantu.kanan;
                simpulP11 B = bantu.kanan.kanan;
                if (A.nama.compareTo(B.nama) > 0) {
                    // tukarkan simpulP11 A dan simpulP11 B
                    A.kanan = B.kanan;
                    if (B != akhir)
                        A.kanan.kiri = A;
                    B.kanan.kiri = A;
                    B.kanan = A;
                    A.kiri = B;
                    bantu.kanan = B;
                    B.kiri = bantu;
                    if (B == akhir)
                        akhir = A;
                }
                bantu = bantu.kanan;
            }
            System.out.println("");
        }
        System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI=====");
    }

    public static void cariLinear() {
        if (awal == null) // jika senarai masih kosong
            System.out.print("....MAAF SENARAI KOSONG....");
        else // jika senarai tidak kosong
        {
            Scanner masukan = new Scanner(System.in);
            System.out.print("Silakan masukkan nama yang anda cari : ");
            String NAMACARI = masukan.nextLine();
            boolean statusKetemu = false;
            int i = 0;
            int posisiKetemu = -1;
            simpulP11 bantu;
            bantu = awal;
            while (bantu != null) {
                if (NAMACARI.equals(bantu.nama)) {
                    statusKetemu = true;
                    posisiKetemu = i;
                }
                bantu = bantu.kanan;
                i++;
            }
            System.out.println("Status Ketemu = " + statusKetemu + " di posisike " + posisiKetemu);

        }
    }

    public static void main(String[] args) {
        inisialisasiSenaraiKosong();
        
        tambahDepan();

        tambahBelakang();

        tambahTengah();

        cetakSenaraiMaju();
        cetakSenaraiMundur();

        tukarNilai(awal, akhir);
        mengurutkanDataBubble_TeknikTukarNilai();
        mengurutkanDataBubble_TeknikTukarHeapSingleLinkedList();
        mengurutkanDataBubble_TeknikTukarHeapDoubleLinkedList();
        cariLinear();
    }
}