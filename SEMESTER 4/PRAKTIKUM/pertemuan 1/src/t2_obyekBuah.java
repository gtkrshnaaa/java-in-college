
// Definisi kelas Buah
class Buah {
    // Atribut-atribut
    private String nama;
    private String warna;
    private String rasa;

    // Konstruktor
    public Buah(String nama, String warna, String rasa) {
        this.nama = nama;
        this.warna = warna;
        this.rasa = rasa;
    }

    // Metode untuk menampilkan informasi buah
    public void getInfo() {
        System.out.println("Buah " + nama + " (" + warna + ", rasa " + rasa + ")");
    }
}

// Kelas utama
public class t2_obyekBuah {
    public static void main(String[] args) {
        // Membuat objek buah
        Buah buah1 = new Buah("Apel", "Merah", "Manis");
        Buah buah2 = new Buah("Jeruk", "Oranye", "Asam");

        // Memanggil metode
        buah1.getInfo(); // Menampilkan informasi buah1
        buah2.getInfo(); // Menampilkan informasi buah2
    }
}
