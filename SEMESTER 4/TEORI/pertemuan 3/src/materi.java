// Kelas pertama
class Atom {
    String nama;
    int nomorAtom;
    String deskripsi;

    // Konstruktor pertama
    public Atom() {
        this("Tidak Diketahui", 0, "Tidak Diketahui");
    }

    // Konstruktor kedua
    public Atom(String nama) {
        this(nama, 0, "Tidak Diketahui");
    }

    // Konstruktor ketiga
    public Atom(String nama, int nomorAtom, String deskripsi) {
        this.nama = nama;
        this.nomorAtom = nomorAtom;
        this.deskripsi = deskripsi;
    }

    // Metode untuk menampilkan informasi
    public void deskripsiAtom() {
        System.out.println("Nama Atom: " + nama + "\nNomor Atom: " + nomorAtom + "\nDeskripsi: " + deskripsi + "\n");
    }
}

// Kelas kedua
class Molekul {
    String nama;
    String rumusKimia;
    String deskripsi;

    // Konstruktor pertama
    public Molekul() {
        this("Tidak Diketahui", "Tidak Diketahui", "Tidak Diketahui");
    }

    // Konstruktor kedua
    public Molekul(String nama) {
        this(nama, "Tidak Diketahui", "Tidak Diketahui");
    }

    // Konstruktor ketiga
    public Molekul(String nama, String rumusKimia, String deskripsi) {
        this.nama = nama;
        this.rumusKimia = rumusKimia;
        this.deskripsi = deskripsi;
    }

    // Metode untuk menampilkan informasi
    public void deskripsiMolekul() {
        System.out.println("Nama Molekul: " + nama + "\nRumus Kimia: " + rumusKimia + "\nDeskripsi: " + deskripsi + "\n");
    }
}

// Kelas ketiga
public class materi {
    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor pertama dari kelas Atom
        Atom atom1 = new Atom();
        System.out.println("Atom 1:");
        atom1.deskripsiAtom();

        // Membuat objek menggunakan konstruktor ketiga dari kelas Atom
        Atom atom2 = new Atom("Hidrogen", 1, "Atom yang paling ringan dan paling umum di alam");
        System.out.println("Atom 2:");
        atom2.deskripsiAtom();

        // Membuat objek menggunakan konstruktor kedua dari kelas Molekul
        Molekul molekul1 = new Molekul("Air");
        System.out.println("Molekul 1:");
        molekul1.deskripsiMolekul();

        // Membuat objek menggunakan konstruktor ketiga dari kelas Molekul
        Molekul molekul2 = new Molekul("Karbon Dioksida", "CO2", "Gas yang penting untuk fotosintesis dan berperan dalam efek rumah kaca");
        System.out.println("Molekul 2:");
        molekul2.deskripsiMolekul();
    }
}
