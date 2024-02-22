import java.util.Scanner;
public class t1_sks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSKS = 0;

        System.out.print("Masukkan jenjang (D3/S1) = ");
        String jenjang = input.nextLine();

        if (jenjang.equals("D3")) {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Masukkan mata kuliah = ");
                String namaMatkul = input.nextLine();
                System.out.print("Masukkan sks = ");
                int sks = input.nextInt();
                input.nextLine(); // membersihkan buffer input
                totalSKS += sks;
            }

        } else if (jenjang.equals("S1")) {
            for (int i = 1; i <= 5; i++) {
                System.out.print("Masukkan mata kuliah = ");
                String namaMatkul = input.nextLine();
                System.out.print("Masukkan sks = ");
                int sks = input.nextInt();
                input.nextLine(); // membersihkan buffer input
                totalSKS += sks;
            }

        } else {
            System.out.println("Jenjang yang dimasukkan tidak valid!");
            System.exit(0); // agar output total sks tidak tampil
        }

        
        System.out.println("Total sks = " + totalSKS);
    }
}











































// import java.util.Scanner;
// public class t1_matkul {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         int maxMatkul = 0;
//         int totalSKS = 0;

//         // Meminta input jenjang dan menentukan maksimum mata kuliah
//         System.out.print("Masukkan ipk = ");
//         double ipk = input.nextDouble();
//                      input.nextLine(); // membersihkan buffer input
//         System.out.print("Masukkan jenjang (D3/S1) = ");
//         String jenjang = input.nextLine();
//         if (jenjang.equals("D3")) {
//             maxMatkul = 3;
//         } else if (jenjang.equals("S1")) {
//             maxMatkul = 5;
//         } else {
//             System.out.println("Jenjang yang dimasukkan tidak valid!");
//             System.exit(0); // agar output total sks tidak tampil
//         }

//         // Meminta input mata kuliah dan sks
//         for (int i = 1; i <= maxMatkul; i++) {
//             System.out.print("Masukkan mata kuliah = ");
//             String namaMatkul = input.nextLine();
//             System.out.print("Masukkan sks = ");
//             int sks = input.nextInt();
//             input.nextLine(); // membersihkan buffer input
//             totalSKS += sks;
//         }

//         // Menampilkan total sks yang diambil
//         System.out.println("Total sks = " + totalSKS);
//     }
// }
