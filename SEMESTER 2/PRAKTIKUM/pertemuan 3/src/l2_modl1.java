import java.util.Scanner;

public class l2_modl1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("Menghitung Nilai Mahasiswa");
        System.out.println("=======================================");

        System.out.print("Masukan Jumlah Mata Kuliah: ");
        int jumlahMataKuliah = input.nextInt();

        System.out.println("=======================================");

        System.out.print("Nama\t: ");
        String nama = input.next();

        System.out.print("NIM\t: ");
        int nim = input.nextInt();

        System.out.print("Jurusan\t: ");
        String jurusan = input.next();

        System.out.println("=======================================");

        String[] namaMataKuliah = new String[jumlahMataKuliah];
        double[] nilaiUts = new double[jumlahMataKuliah];
        double[] nilaiUas = new double[jumlahMataKuliah];
        double[] nilaiAkhir = new double[jumlahMataKuliah];
        char[] grade = new char[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Mata kuliah ke-" + (i + 1) + " : ");
            namaMataKuliah[i] = input.next();

            System.out.print("Nilai UTS : ");
            nilaiUts[i] = input.nextDouble();

            System.out.print("Nilai UAS : ");
            nilaiUas[i] = input.nextDouble();

            System.out.println(" ");

            nilaiAkhir[i] = 0.7 * nilaiUts[i] + 0.3 * nilaiUas[i];

            if (nilaiAkhir[i] >= 85) {
                grade[i] = 'A';
            } else if (nilaiAkhir[i] >= 70) {
                grade[i] = 'B';
            } else if (nilaiAkhir[i] >= 55) {
                grade[i] = 'C';
            } else if (nilaiAkhir[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'E';
            }
        }
    
        System.out.println("=======================================");
        System.out.printf("%-15s%-15s\n","Nama : " + nama, "NPM : " + nim);
        System.out.println("=======================================");
    
        System.out.printf("%-15s%-15s%-15s\n","Mata Kuliah", "Nilai", "Grade");
        System.out.println("=======================================");
    
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.printf("%-15s%-15s%-15s\n", namaMataKuliah[i], String.format("%.1f", nilaiAkhir[i]),
                    grade[i]);
        }
    
        System.out.println("=======================================");
    }
}    
