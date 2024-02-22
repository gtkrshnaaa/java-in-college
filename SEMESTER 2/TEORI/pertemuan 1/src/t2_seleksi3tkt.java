import java.util.Scanner;

public class t2_seleksi3tkt {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Selamat datang di sesi pendaftaran kartu kredit!");
        System.out.print("Apakah anda memiliki penghasilan tetap? (y/n): ");
        char hasIncm = inp.next().charAt(0);

        if (hasIncm == 'y' || hasIncm == 'Y') {
            System.out.print("Apakah penghasilan tetap anda diatas 4 juta/bulan? (y/n): ");
            char isIncm = inp.next().charAt(0);

            if (isIncm == 'y' || isIncm == 'Y') {
                System.out.print("Apakah usia Anda di atas 21 tahun? (y/n): ");
                char isAbv21 = inp.next().charAt(0);

                if (isAbv21 == 'y' || isAbv21 == 'Y') {
                    System.out.println("Anda dapat mendaftar untuk kartu kredit platinum.");
                } else {
                    System.out.println("Anda dapat mendaftar untuk kartu kredit gold.");
                }
            }
            else {
                System.out.println("Maaf, Anda tidak memenuhi persyaratan untuk mendaftar kartu kredit.");
            }
        

        }
        else {
        System.out.println("Maaf, Anda tidak memenuhi persyaratan untuk mendaftar kartu kredit.");
        }
    }
}