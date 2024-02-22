import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner scninput = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("Menu Hitung:");
            System.out.println("1. Segitiga Sama Kaki");
            System.out.println("2. Segiempat");
            System.out.println("3. Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-3): ");
            
            pilihan = scninput.nextInt();
            
            switch (pilihan) {
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                case 1:
                    hitungSegitiga(scninput);
                    break;
                case 2:
                    hitungSegiempat(scninput);
                    break;
                case 3:
                    hitungLingkaran(scninput);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            System.out.println();
        } while (pilihan != 0);
        
        scninput.close();
    }
    
    public static void hitungSegitiga(Scanner scninput) {
        System.out.print("Masukkan panjang alas segitiga: ");
        double alas = scninput.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = scninput.nextDouble();
        
        double luas = 0.5 * alas * tinggi;
        double keliling = 2 * alas + Math.sqrt(2) * tinggi;
        
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }
    
    public static void hitungSegiempat(Scanner scninput) {
        System.out.print("Masukkan panjang sisi segiempat: ");
        double sisi = scninput.nextDouble();
        
        double luas = sisi * sisi;
        double keliling = 4 * sisi;
        
        System.out.println("Luas segiempat: " + luas);
        System.out.println("Keliling segiempat: " + keliling);
    }
    
    public static void hitungLingkaran(Scanner scninput) {
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scninput.nextDouble();
        
        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;
        
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
