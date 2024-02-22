import java.util.Scanner;

public class soalUTS3 {
    public static void main(String[] args) {
        // Membuat array 2 dimensi untuk menyimpan data peserta
        String[][] dataPeserta = new String[4][2];
        
        // Membaca input data peserta dari user
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan nama provinsi: ");
            dataPeserta[i][0] = scanner.nextLine();
            System.out.print("Masukkan jumlah peserta: ");
            dataPeserta[i][1] = scanner.nextLine();
        }
        
        // Menampilkan data peserta yang sudah dimasukkan
        System.out.println("Provinsi\tJumlah Peserta");
        System.out.println("----------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println(dataPeserta[i][0] + "\t" + dataPeserta[i][1]);
        }
        
        // Menghitung jumlah total peserta
        int totalPeserta = 0;
        for (int i = 0; i < 4; i++) {
            totalPeserta += Integer.parseInt(dataPeserta[i][1]);
        }
        
        // Menampilkan jumlah total peserta
        System.out.println("Total\t" + totalPeserta);
    }
}
