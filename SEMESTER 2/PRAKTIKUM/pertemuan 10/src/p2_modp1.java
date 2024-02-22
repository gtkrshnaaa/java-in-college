import java.util.Scanner;

public class p2_modp1 {
    public static void cetakUlang(int nUlang) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kalimat yang akan dicetak:");
        String kalimat = scan.nextLine();
        
        for (int i = 0; i < nUlang; i++) {
            System.out.println("Cetak ke " + (i + 1) + ": " + kalimat);
        }
    }

    public static void main(String[] args) {
        int nUlang;
        Scanner scan = new Scanner(System.in);
        System.out.print("Akan dicetak berapa kali: ");
        nUlang = scan.nextInt();
        cetakUlang(nUlang);
    }
}
