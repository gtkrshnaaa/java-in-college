// Kelas pertama
class Bintang {
    String nama, konstelasi, deskripsi;

    // Konstruktor pertama
    public Bintang() { this("Tidak Diketahui", "Tidak Diketahui", "Tidak Diketahui"); }
    // Konstruktor kedua
    public Bintang(String nama) { this(nama, "Tidak Diketahui", "Tidak Diketahui"); }
    // Konstruktor ketiga
    public Bintang(String nama, String konstelasi, String deskripsi) {
        this.nama = nama; this.konstelasi = konstelasi; this.deskripsi = deskripsi;
    }

    // Metode untuk menampilkan informasi
    public void deskripsiBintang() {
        System.out.println("Nama Bintang: " + nama + "\nKonstelasi: " + konstelasi + "\nDeskripsi: " + deskripsi + "\n");
    }
}

// Kelas kedua
class Konstelasi {
    String nama, deskripsi; int jumlahBintang;

    // Konstruktor pertama
    public Konstelasi() { this("Tidak Diketahui", 0, "Tidak Diketahui"); }
    // Konstruktor kedua
    public Konstelasi(String nama) { this(nama, 0, "Tidak Diketahui"); }
    // Konstruktor ketiga
    public Konstelasi(String nama, int jumlahBintang, String deskripsi) {
        this.nama = nama; this.jumlahBintang = jumlahBintang; this.deskripsi = deskripsi;
    }

    // Metode untuk menampilkan informasi
    public void deskripsiKonstelasi() {
        System.out.println("Nama Konstelasi: " + nama + "\nJumlah Bintang: " + jumlahBintang + "\nDeskripsi: " + deskripsi + "\n");
    }
}

public class langit {
    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor pertama dari kelas Bintang
        Bintang bintang1 = new Bintang();
        System.out.println("Bintang 1:");
        bintang1.deskripsiBintang();

        // Membuat objek menggunakan konstruktor kedua dari kelas Bintang
        Bintang bintang2 = new Bintang("Sirius");
        System.out.println("Bintang 2:");
        bintang2.deskripsiBintang();

        // Membuat objek menggunakan konstruktor ketiga dari kelas Bintang
        Bintang bintang3 = new Bintang("Betelgeuse", "Orion", "Bintang super raksasa merah terang");
        System.out.println("Bintang 3:");
        bintang3.deskripsiBintang();

        // Membuat objek menggunakan konstruktor pertama dari kelas Konstelasi
        Konstelasi konstelasi1 = new Konstelasi();
        System.out.println("Konstelasi 1:");
        konstelasi1.deskripsiKonstelasi();

        // Membuat objek menggunakan konstruktor kedua dari kelas Konstelasi
        Konstelasi konstelasi2 = new Konstelasi("Orion");
        System.out.println("Konstelasi 2:");
        konstelasi2.deskripsiKonstelasi();

        // Membuat objek menggunakan konstruktor ketiga dari kelas Konstelasi
        Konstelasi konstelasi3 = new Konstelasi("Ursa Major", 7, "Konstelasi utara yang terkenal");
        System.out.println("Konstelasi 3:");
        konstelasi3.deskripsiKonstelasi();
    }
}
