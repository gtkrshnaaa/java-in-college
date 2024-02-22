import java.util.Scanner;

class simpul {
    // Bagian deklarasi struktur record
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
    simpul kanan;
}

class singleLinkedListP2 {
    public static simpul awal;
    public static simpul akhir;

    public static void inisialisasiSenaraiKosong() {
        awal = null;
        akhir = null;
    }

    public static void tambahDepan() {
        // Bagian entri data dari keyboard
        String NAMA;
        String ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;

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

        // Bagian menciptakan & mengisi simpul baru
        simpul baru;
        baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;

        // Bagian mencangkokkan simpul baru ke dalam simpul lama
        if (awal == null) {
            awal = baru;
            akhir = baru;
            baru.kanan = null;
        } else {
            baru.kanan = awal;
            awal = baru;
        }
    }

    public static void tambahBelakang() {
        // Bagian entri data dari keyboard
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

        // Bagian menciptakan & mengisi simpul baru
        simpul baru;
        baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk = IPK;

        // Bagian mencangkokkan simpul baru ke dalam simpul lama
        if (awal == null) {
            awal = baru;
            akhir = baru;
            baru.kanan = null;
        } else {
            akhir.kanan = baru;
            akhir = baru;
            baru.kanan = null;
        }
    }

    public static void cetakSenarai() {
        if (awal == null) {
            System.out.print("....MAAF SENARAI KOSONG....");
        } else {
            System.out.println("---------------------------------------------------");
            System.out.println("NO NAMA           ALAMAT       UMUR    JEKEL   IPK ");
            System.out.println("---------------------------------------------------");
            simpul bantu;
            bantu = awal;
            while (bantu != null) {
                System.out.print(bantu.nama + "\t  ");
                System.out.print(bantu.alamat + "\t  ");
                System.out.print(bantu.umur + "\t  ");
                System.out.print(bantu.jekel + "\t  ");
                System.out.print(bantu.hobi[0] + "\t  ");
                System.out.print(bantu.hobi[1] + "\t  ");
                System.out.print(bantu.hobi[2] + "\t  ");
                System.out.println(bantu.ipk);
                bantu = bantu.kanan;
            }
            System.out.println("---------------------------------------------------");
        }
    }

    // Bagian program utama
    public static void main(String[] args) {
        inisialisasiSenaraiKosong();
        tambahDepan();
        tambahDepan();
        tambahDepan();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        cetakSenarai();

        // Tambahkan data mahasiswa sembarang dengan tambahDepan() di sini
        tambahDepan();
        tambahDepan();
        tambahDepan();
        
        cetakSenarai();

        tambahBelakang(); 
        tambahBelakang(); 
        tambahBelakang(); 
        tambahBelakang(); 

        cetakSenarai(); 
    }
}
