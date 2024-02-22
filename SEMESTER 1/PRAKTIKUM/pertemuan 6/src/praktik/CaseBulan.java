package praktik;

import java.util.Scanner;
class CaseBulan {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int kode_bulan;
        System.out.print("Masukkan kode bulan : ");
        kode_bulan = masuk.nextInt();
        switch (kode_bulan) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Jumlah hari = 31 hari");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Jumlah hari = 30 hari");
                break;
            case 2:
                System.out.println("Jumlah hari 28 atau 29 hari");
            default:
                System.out.println("Salah masukkan kode bulan");

        }
    }

}