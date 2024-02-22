package tugas;

import java.util.Scanner;
public class modul6_T1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan, panjang, lebar, r;
        double luas, phi = 3.14;

        System.out.println("Ketikkan 1 untuk menghitung luas persegi panjang.");
        System.out.println("Ketikkan 2 untuk menghitung luas lingkaran.");
        System.out.println("------------------------------------------------");
        System.out.print("Masukkan pilihan = ");
        pilihan=input.nextInt();
        switch (pilihan) {

            case 1:
                System.out.println("Menghitung luas persegi panjang.");
                System.out.print("Masukkan panjang = ");
                panjang=input.nextInt();
                System.out.print("Masukkan lebar = ");
                lebar=input.nextInt();
                luas = panjang*lebar;
                System.out.print("Luas persegi panjang = "+luas);
                break;

            case 2:
                System.out.println("Menghitung luas lingkaran.");
                System.out.print("Masukkan jari jari = ");
                r=input.nextInt();
                luas= phi * r * r;
                System.out.print("Luas lingkaran = "+luas);
                break;

            default:
                System.out.println("Salah masukkan pilihan.");

        }
    }
}
