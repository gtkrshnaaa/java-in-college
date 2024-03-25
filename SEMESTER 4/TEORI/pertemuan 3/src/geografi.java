// Kelas pertama
class Samudra {
    String nama;
    int kedalaman;
    String deskripsi;

    // Konstruktor pertama
    public Samudra() { this("Tidak Diketahui", 0, "Tidak Diketahui"); }

    // Konstruktor kedua
    public Samudra(String nama) { this(nama, 0, "Tidak Diketahui"); }

    // Konstruktor ketiga
    public Samudra(String nama, int kedalaman, String deskripsi) {
        this.nama = nama;
        this.kedalaman = kedalaman;
        this.deskripsi = deskripsi;
    }

    // Metode untuk menampilkan informasi
    public void deskripsiSamudra() {
        System.out.println("Nama Samudra: " + nama + "\nKedalaman: " + kedalaman + " meter\nDeskripsi: " + deskripsi + "\n");
    }
}

// Kelas kedua
class Benua {
    String nama;
    double luas;
    String deskripsi;

    // Konstruktor pertama
    public Benua() { this("Tidak Diketahui", 0, "Tidak Diketahui"); }

    // Konstruktor kedua
    public Benua(String nama) { this(nama, 0, "Tidak Diketahui"); }

    // Konstruktor ketiga
    public Benua(String nama, double luas, String deskripsi) {
        this.nama = nama;
        this.luas = luas;
        this.deskripsi = deskripsi;
    }

    // Metode untuk menampilkan informasi
    public void deskripsiBenua() {
        System.out.println("Nama Benua: " + nama + "\nLuas: " + luas + " km^2\nDeskripsi: " + deskripsi + "\n");
    }
}

// Kelas ketiga (kelas yang berisi method main)
public class geografi {
    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor pertama dari kelas Samudra
        Samudra samudra1 = new Samudra();
        System.out.println("Samudra 1:");
        samudra1.deskripsiSamudra();

        // Membuat objek menggunakan konstruktor ketiga dari kelas Samudra
        Samudra samudra2 = new Samudra("Samudra Pasifik", 11034, "Samudra terbesar di dunia yang meliputi wilayah luas di Pasifik");
        System.out.println("Samudra 2:");
        samudra2.deskripsiSamudra();

        // Membuat objek menggunakan konstruktor kedua dari kelas Benua
        Benua benua1 = new Benua("Asia");
        System.out.println("Benua 1:");
        benua1.deskripsiBenua();

        // Membuat objek menggunakan konstruktor ketiga dari kelas Benua
        Benua benua2 = new Benua("Eropa", 10180000, "Benua yang terletak di belahan utara");
        System.out.println("Benua 2:");
        benua2.deskripsiBenua();
    }
}
