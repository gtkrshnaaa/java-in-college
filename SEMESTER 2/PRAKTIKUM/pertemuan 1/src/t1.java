import java.util.Scanner;
public class t1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int th, bln, numHari = 0;

        System.out.print("Masukkan tahun: ");
        th = inp.nextInt();

        System.out.print("Masukkan bulan (1 - 12): ");
        bln = inp.nextInt();

        switch (bln) {
            case 1:
                System.out.println("Januari " + th + " memiliki 31 hari");
                break;
            case 2:
                if (th % 4 == 0 ){
                    numHari = 29;
                }
                else {
                    numHari = 28;
                }
                System.out.println("Februari " + th + " memiliki " + numHari + " hari");
                break;
            case 3:
                System.out.println("Maret " + th + " memiliki 31 hari");
                break;
            case 4:
                System.out.println("April " + th + " memiliki 30 hari");
                break;
            case 5:
                System.out.println("Mei " + th + " memiliki 31 hari");
                break;
            case 6:
                System.out.println("Juni " + th + " memiliki 30 hari");
                break;
            case 7:
                System.out.println("Juli " + th + " memiliki 31 hari");
                break;
            case 8:
                System.out.println("Agustus " + th + " memiliki 31 hari");
                break;
            case 9:
                System.out.println("September " + th + " memiliki 30 hari");
                break;
            case 10:
                System.out.println("Oktober " + th + " memiliki 31 hari");
                break;
            case 11:
                System.out.println("November " + th + " memiliki 30 hari");
                break;
            case 12:
                System.out.println("Desember " + th + " memiliki 31 hari");
                break;
            default:
                System.out.println("Bulan yang dimasukkan tidak valid");
                break;
            }

    }
}



