import java.util.Scanner;

public class t1_latihan {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Pilih 1 untuk mobil, 2 untuk motor: ");
        int pilUtama = inp.nextInt();

        if (pilUtama == 1) {
            System.out.print("Pilih 1 untuk Honda, 2 untuk Suzuki: ");
            int pilMerek = inp.nextInt();

            if (pilMerek == 1) {
                System.out.print("Pilih 1 untuk Jazz, 2 untuk Brio, 3 untuk Mobilio : ");
                int pilModel = inp.nextInt();

                switch (pilModel) {
                    case 1:
                        System.out.println("Harga Jazz: 170 jt");
                        break;
                    case 2:
                        System.out.println("Harga Brio: 120 jt");
                        break;
                    case 3:
                        System.out.println("Harga Mobilio: 170 jt");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia.");
                        break;
                }
            } else if (pilMerek == 2) {
                System.out.print("Pilih 1 untuk APV, 2 untuk Swift, 3 untuk Ertiga : ");
                int pilModel = inp.nextInt();

                switch (pilModel) {
                    case 1:
                        System.out.println("Harga APV: 180 jt");
                        break;
                    case 2:
                        System.out.println("Harga Swift: 155 jt");
                        break;
                    case 3:
                        System.out.println("Harga Ertiga: 160 jt");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia.");
                        break;
                }
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        } else if (pilUtama == 2) {
            System.out.print("Pilih 1 untuk Honda, 2 untuk Yamaha: ");
            int pilMerek = inp.nextInt();

            if (pilMerek == 1) {
                System.out.print("Pilih 1 untuk Vario, 2 untuk Supra : ");
                int pilModel = inp.nextInt();

                switch (pilModel) {
                    case 1:
                        System.out.println("Harga Vario: 15 jt");
                        break;
                    case 2:
                        System.out.println("Harga Supra: 12 jt");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia.");
                        break;
                }
            } else if (pilMerek == 2) {
                System.out.print("Pilih 1 untuk Mio, 2 untuk Vixion : ");
                int pilModel = inp.nextInt();

                switch (pilModel) {
                    case 1:
                        System.out.println("Harga Mio: 14 jt");
                        break;
                    case 2:
                        System.out.println("Harga Vixion: 20 jt");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia.");
                        break;
                }
            } else {
                System.out.println("Pilihan tidak tersedia.");
            }
        } else {
            System.out.println("Pilihan tidak tersedia.");
        }
    }
}
