import java.util.Scanner;

public class quis3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String pesawat, diskon = "0%";
        int hargaTiket = 0, jumlahBeli, totalBayar, hargaDiskon, grandTotal;
        boolean beliLagi = true;

        while (beliLagi) {
            System.out.print("Masukkan nama pesawat (Garuda, Lion, atau Batavia): ");
            pesawat = input.nextLine();

            if (pesawat.equalsIgnoreCase("Garuda")) {
                hargaTiket = 400000;
                System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
                jumlahBeli = input.nextInt();
                input.nextLine();
                if (jumlahBeli >= 100) {
                    hargaDiskon = hargaTiket * jumlahBeli / 2;
                    diskon = "50%";
                } else {
                    hargaDiskon = 0;
                    diskon = "0%";
                }
            } else if (pesawat.equalsIgnoreCase("Lion")) {
                hargaTiket = 300000;
                System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
                jumlahBeli = input.nextInt();
                input.nextLine();
                if (jumlahBeli > 50) {
                    hargaDiskon = hargaTiket * jumlahBeli / 10;
                    diskon = "10%";
                } else {
                    hargaDiskon = 0;
                    diskon = "0%";
                }
            } else if (pesawat.equalsIgnoreCase("Batavia")) {
                hargaTiket = 200000;
                System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
                jumlahBeli = input.nextInt();
                input.nextLine();
                hargaDiskon = 0;
                diskon = "0%";
            } else {
                System.out.println("Pesawat yang Anda masukkan tidak tersedia.");
                continue;
            }

            totalBayar = hargaTiket * jumlahBeli;
            grandTotal = totalBayar - hargaDiskon;

            System.out.println("Nama pesawat: " + pesawat);
            System.out.println("Harga tiket: Rp. " + hargaTiket);
            System.out.println("Jumlah beli: " + jumlahBeli);
            System.out.println("Total bayar: Rp. " + totalBayar);
            System.out.println("Diskon: " + diskon);
            System.out.println("Grand total: Rp. " + grandTotal);

            System.out.print("Apakah Anda ingin membeli tiket lagi? (y/n): ");
            String jawaban = input.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                beliLagi = false;
                System.out.println("Terimakasih, semoga perjalanan anda menyenangkan!");
            }
        }
    }
}