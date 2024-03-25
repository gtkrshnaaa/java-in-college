
import astronomy.star;

public class t4_mainProgram {
    public static void main(String[] args) {
        // membuat objek bintang
        star sun = new star("Sun", -26.74, 0); // contoh data untuk Matahari
        star sirius = new star("Sirius", -1.46, 8.6); // contoh data untuk Sirius
        
        // menampilkan informasi tentang bintang
        System.out.println("Informasi tentang Matahari:");
        sun.displayInfo();
        
        System.out.println("\nInformasi tentang Sirius:");
        sirius.displayInfo();
    }
}
