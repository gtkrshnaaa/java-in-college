import java.util.Scanner;

public class soalUAS2 {
    public static void main(String[] args) {
        String[][] dataMhs = new String[6][3];

        Scanner inp = new Scanner(System.in);

        // Memasukkan dataMhs dari pengguna
        for (int i = 0; i < 6; i++) {
            System.out.print("Masukkan nama: ");
            dataMhs[i][0] = inp.nextLine();

            System.out.print("Masukkan nilai: ");
            dataMhs[i][1] = inp.nextLine();

            //memasukan dataMhs[i][1] ke variable nilai dengan tipe data int
            int nilai = Integer.parseInt(dataMhs[i][1]);

            // Menentukan index berdasarkan nilai
            if (nilai >= 80) {
                dataMhs[i][2] = "A";
            } else if (nilai >= 70) {
                dataMhs[i][2] = "B";
            } else if (nilai >= 60) {
                dataMhs[i][2] = "C";
            } else if (nilai >= 50) {
                dataMhs[i][2] = "D";
            }
            else {
                dataMhs[i][2] = "E";
            }
        }

        // Menampilkan output
        System.out.println("======================================");
        System.out.println("Nama\t\tNilai\t\tIndex");
        System.out.println("======================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(dataMhs[i][0] + "\t\t" + dataMhs[i][1] + "\t\t" + dataMhs[i][2]);
        }
    }
}

/*
 import java.util.Scanner;

public class soalUAS2 {
    public static void main(String[] args) {
        String[][] dataMhs = new String[6][2];

        Scanner inp = new Scanner(System.in);

        // Memasukkan dataMhs dari pengguna
        for (int i = 0; i < 6; i++) {
            System.out.print("Masukkan nama: ");
            dataMhs[i][0] = inp.nextLine();

            System.out.print("Masukkan nilai: ");
            dataMhs[i][1] = inp.nextLine();

        }
        Integer.parseInt(dataMhs[i][1]);

        if (dataMhs[i][1] < 50) {
            dataMhs[i][2] = "E";
        } if else (dataMhs[i][1] >= 50) {
            dataMhs[i][2] = "D";
        } if else (dataMhs[i][1] >= 60) {
            dataMhs[i][2] = "C";
        } if else (dataMhs[i][1] >= 70) {
            dataMhs[i][2] = "B";
        }
        else {
            dataMhs[i][2] = "Input tidak valid";
        }
            

        System.out.println("======================================");
        System.out.println("Nama\t\tNilai\t\tIndex");
        System.out.println("======================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(dataMhs[i][0] + "\t\t" + dataMhs[i][1] + "\t\t" + dataMhs[i][2]);
        }
    }
}

 */