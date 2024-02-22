import java.util.Scanner;
class modul6_L1 {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        int kode_bulan;
        System.out.print("Masukkan kode bulan : ");
        kode_bulan = masuk.nextInt();

        if (kode_bulan == 1 || kode_bulan == 3 || kode_bulan == 5 || kode_bulan == 7 || kode_bulan == 8 || kode_bulan == 10 || kode_bulan == 12){
            System.out.println("Jumlah hari = 31 hari");
        } else if (kode_bulan == 4 || kode_bulan == 6 || kode_bulan == 9 || kode_bulan == 11){
            System.out.println("Jumlah hari = 30 hari");
        } else if (kode_bulan == 2){
            System.out.println("Jumlah hari = 28 atau 29 hari");
        }else {
            System.out.println("Salah masukkan kode");
        }

    }

}