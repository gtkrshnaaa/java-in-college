import java.util.Scanner;

public class l1_modp3 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println("Bilangan Genap adalah " + i);
            } else {
                if (i % 3 != 0) {
                    System.out.println("Bilangan Ganjil adalah " + i);
                }
            }
            i++;
        }
    }
}

// Ini merupakan modifikasi program praktik 3 yang mana perbedaan yang terlihat adalah perulangan for menggunakan counter i sebagai variabel loop di dalam strukturnya, sedangkan pada perulangan while, variabel counter harus dideklarasikan dan diinisialisasi sebelum perulangan dimulai, dan kemudian diinkremen setiap kali perulangan selesai dijalankan.