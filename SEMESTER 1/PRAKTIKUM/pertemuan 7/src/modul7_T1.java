import java.util.Scanner;
public class modul7_T1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String jenjang, jurusan;

            System.out.print("Masukan jenjang D3 atau S1 = ");
            jenjang = input.next();
            System.out.print("Masukan jurusan = ");
            jurusan = input.next();

            switch (jenjang) {
                case "D3" :

                        switch (jurusan) {

                            case "TK" : case "KA" : case "MI" :
                            System.out.println("Besaran SPA yang harus anda bayar adalah Rp 10.000.000.");

                            default :
                            System.out.println("Salah masukan jurusan.");
                        }
                break;
                case "S1" :

                        switch (jurusan) {

                            case "TI" :
                            System.out.println("Besaran SPA yang harus anda bayar adalah Rp 13.000.000.");
                            break;

                            case "SI" :
                            System.out.println("Besaran SPA yang harus anda bayar adalah Rp 12.000.000.");
                            break;

                            default :
                            System.out.println("Salah masukan jurusan.");
                        }
                break ;
                default :
                System.out.println("Salah masukan jenjang.");

                 }

        }
}

