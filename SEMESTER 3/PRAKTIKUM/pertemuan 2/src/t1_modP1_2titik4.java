import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class t1_modP1_2titik4 {
    public static int MAX_RECORDS = 20;

    public static void ngentriData(formatBiodata biodataMahasiswa[], int startIndex, int N) {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;
        for (int i = startIndex; i < startIndex + N; i++) {
            System.out.print("Silakan masukkan nama anda : ");
            biodataMahasiswa[i] = new formatBiodata();
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Silakan masukkan alamat anda : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Silakan masukkan umur anda : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda (L/P) : ");
            biodataMahasiswa[i].jekel = masukan.next().charAt(0);
            System.out.println("Silakan masukkan hobi (maks 3) : ");
            System.out.print("hobi ke-0 : ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("hobi ke-1 : ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("hobi ke-2 : ");
            biodataMahasiswa[i].hobi[2] = masukan.next();
            System.out.print("Silakan masukkan IPK anda : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
            System.out.println("");
        }
    }

    public static void tampilkanData(formatBiodata biodataMahasiswa[], int N) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("NAMA\t ALAMAT\t UMUR\t JEKEL\t HOBI1\t HOBI2\t HOBI3\t IPK");
        System.out.println("----------------------------------------------------------------");
        for (int i = 0; i < N; i++) {
            System.out.print(biodataMahasiswa[i].nama + "\t ");
            System.out.print(biodataMahasiswa[i].alamat + "\t ");
            System.out.print(biodataMahasiswa[i].umur + "\t ");
            System.out.print(biodataMahasiswa[i].jekel + "\t ");
            System.out.print(biodataMahasiswa[i].hobi[0] + "\t ");
            System.out.print(biodataMahasiswa[i].hobi[1] + "\t ");
            System.out.print(biodataMahasiswa[i].hobi[2] + "\t ");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("----------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int N = 0;
        formatBiodata biodataMahasiswa[] = new formatBiodata[MAX_RECORDS];
        int jumlahDataDimasukkan = 0;

        while (jumlahDataDimasukkan < MAX_RECORDS) {
            System.out.print("Masukkan jumlah data (max " + (MAX_RECORDS - jumlahDataDimasukkan) + "): ");
            N = masukan.nextInt();

            if (N > (MAX_RECORDS - jumlahDataDimasukkan)) {
                System.out.println("Jumlah data melebihi batas maksimum yang tersisa.");
                continue;
            }

            ngentriData(biodataMahasiswa, jumlahDataDimasukkan, N);
            jumlahDataDimasukkan += N;

            System.out.println("Data yang telah dimasukkan:");
            tampilkanData(biodataMahasiswa, jumlahDataDimasukkan);

            char ulangi;
            if (jumlahDataDimasukkan < MAX_RECORDS) {
                System.out.print("Apakah anda ingin memasukkan data lagi? (Y/N): ");
                ulangi = masukan.next().charAt(0);
                if (ulangi != 'Y' && ulangi != 'y') {
                    System.out.println("Terimakasih!");
                    break;
                }
            } else {
                System.out.println("Anda telah mencapai batas maksimum data.");
                break;
            }
        }
    }
}
