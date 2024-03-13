
// Definisi kelas Mobil
class Mobil {
    // Atribut-atribut
    private String merek;
    private String warna;
    private int tahunProduksi;

    // Konstruktor
    public Mobil(String merek, String warna, int tahunProduksi) {
        this.merek = merek;
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }

    // Metode untuk menyalakan mobil
    public void nyalakanMobil() {
        System.out.println("Mobil " + merek + " telah dinyalakan.");
    }

    // Metode untuk mematikan mobil
    public void matikanMobil() {
        System.out.println("Mobil " + merek + " telah dimatikan.");
    }

    // Metode untuk mendapatkan informasi mobil
    public void getInfo() {
        System.out.println("Mobil " + merek + " (" + warna + ", tahun " + tahunProduksi + ")");
    }
}

// Kelas utama
public class t1_obyekMobil {
    public static void main(String[] args) {
        // Membuat objek mobil
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2020);
        Mobil mobil2 = new Mobil("Honda", "Putih", 2018);

        // Memanggil metode
        mobil1.getInfo(); // Menampilkan informasi mobil1
        mobil1.nyalakanMobil(); // Menyalakan mobil1
        mobil1.matikanMobil(); // Mematikan mobil1

        mobil2.getInfo(); // Menampilkan informasi mobil2
        mobil2.nyalakanMobil(); // Menyalakan mobil2
        mobil2.matikanMobil(); // Mematikan mobil2
    }
}
