// buatlah program java dengan memasukan nama pesawat dimana pilihanya Garuda, Lion, dan Batavia (inputan), kemudian masukan jumlah tiket, kondisi yang terjadi adalah jika nama pesawat Garuda harga harga tiketnya Rp. 400.000,- dan apabila jumlah pembelian tiket >= 100 maka mendapat diskon 50%, jika nama pesawat adalah Lion maka harga tiketnya Rp.300.000,-  dan apabila jumlah pembelian tiket > 50 maka mendapat diskon 10%, jika nama pesawat Batavia  maka harga tiketnya Rp. 200.000,-  dan apabila jumlah pembelian tiket > 20 maka diskon 0%, selain itu tidak ada.

// Output yang diminta adalah:
// nama pesawat
// harga tiket
// jumlah beli
// total bayar
// harga diskon
// grand total

// import java.util.Scanner;

// public class tugas1 {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         String pesawat, diskon = "0%";
//         int hargaTiket = 0, jumlahBeli, totalBayar, hargaDiskon, grandTotal;

//         System.out.print("Masukkan nama pesawat (Garuda, Lion, atau Batavia): ");
//         pesawat = input.nextLine();

//         if (pesawat.equals("Garuda")) {
//             hargaTiket = 400000;
//             System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
//             jumlahBeli = input.nextInt();
//             if (jumlahBeli >= 100) {
//                 hargaDiskon = hargaTiket / 2;
//                 diskon = "50%";
//             } else {
//                 hargaDiskon = 0;
//             }
//         } 
//         else if (pesawat.equals("Lion")) {
//             hargaTiket = 300000;
//             System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
//             jumlahBeli = input.nextInt();
//             if (jumlahBeli > 50) {
//                 hargaDiskon = hargaTiket / 10;
//                 diskon = "10%";
//             } else {
//                 hargaDiskon = 0;
//             }
//         } 
//         else if (pesawat.equals("Batavia")) {
//             hargaTiket = 200000;
//             System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
//             jumlahBeli = input.nextInt();
//             hargaDiskon = 0;
//         } 
//         else {
//             System.out.println("Pesawat yang Anda masukkan tidak tersedia.");
//             return;
//         }

//         totalBayar = hargaTiket * jumlahBeli;
//         grandTotal = totalBayar - hargaDiskon;

//         System.out.println("Nama pesawat: " + pesawat);
//         System.out.println("Harga tiket: Rp. " + hargaTiket);
//         System.out.println("Jumlah beli: " + jumlahBeli);
//         System.out.println("Total bayar: Rp. " + totalBayar);
//         System.out.println("Diskon: " + diskon);
//         System.out.println("Grand total: Rp. " + grandTotal);
//     }
// }

import java.util.Scanner;

public class tugas1 {
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
                }
            } else if (pesawat.equalsIgnoreCase("Batavia")) {
                hargaTiket = 200000;
                System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
                jumlahBeli = input.nextInt();
                input.nextLine();
                hargaDiskon = 0;
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


// pcdode
// 1. Inisialisasi variabel:
//    -pesawat sebagai string
//    -diskon sebagai string dengan nilai awal "0%"
//    -hargaTiket sebagai integer dengan nilai awal 0
//    -jumlahBeli sebagai integer dengan nilai awal 0
//    -totalBayar sebagai integer dengan nilai awal 0
//    -hargaDiskon sebagai integer dengan nilai awal 0
//    -grandTotal sebagai integer dengan nilai awal 0
//    -beliLagi sebagai boolean dengan nilai awal true
// 2. Mulai perulangan while dengan kondisi beliLagi == true
// 3. Minta pengguna memasukkan nama pesawat dan simpan dalam variabel pesawat
// 4. Jika pesawat sama dengan "Garuda", set hargaTiket ke 400000
//    -Minta pengguna memasukkan jumlah tiket yang ingin dibeli dan simpan dalam variabel jumlahBeli
//    -Jika jumlahBeli lebih besar atau sama dengan 100, set hargaDiskon menjadi hargaTiket / 2 dan set diskon menjadi "50%", jika tidak set hargaDiskon menjadi 0
// 5. Jika pesawat sama dengan "Lion", set hargaTiket ke 300000
//    -Minta pengguna memasukkan jumlah tiket yang ingin dibeli dan simpan dalam variabel jumlahBeli
//    -Jika jumlahBeli lebih besar dari 50, set hargaDiskon menjadi hargaTiket / 10 dan set diskon menjadi "10%", jika tidak set hargaDiskon menjadi 0
// 6. Jika pesawat sama dengan "Batavia", set hargaTiket ke 200000 dan set hargaDiskon menjadi 0
// 7. Jika pesawat tidak sama dengan "Garuda", "Lion", atau "Batavia", cetak "Pesawat yang Anda masukkan tidak tersedia." dan lanjutkan ke langkah 3
// 8. Hitung totalBayar dengan mengalikan hargaTiket dengan jumlahBeli
// 9. Hitung grandTotal dengan mengurangi hargaDiskon dari totalBayar
// 10.Cetak informasi tiket, termasuk nama pesawat, harga tiket, jumlah beli, total bayar, diskon, dan grand total
// 11.Minta pengguna apakah ingin membeli tiket lagi dengan meminta input "y" atau "n" dan simpan dalam variabel jawaban
// 12.Jika jawaban sama dengan "n", set beliLagi menjadi false dan cetak "Terimakasih, semoga perjalanan anda menyenangkan!"
// 13.Ulangi dari langkah 3 sampai 12 selama beliLagi == true.