import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class p2_modP1_2titik4 {
    public static int N = 10;

    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);

        for (int i = 0; i < N; i++) {
            System.out.print("Silakan masukkan nama anda : ");
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Silakan masukkan alamat anda : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Silakan masukkan umur anda : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda (L/P) : ");
            biodataMahasiswa[i].jekel = masukan.next().charAt(0);
            System.out.println("Silakan masukkan hobi (maks 3) : ");
            for (int j = 0; j < 3; j++) {
                System.out.print("hobi ke-" + j + " : ");
                biodataMahasiswa[i].hobi[j] = masukan.next();
            }
            System.out.print("Silakan masukkan IPK anda : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
            System.out.println("");
        }
    }

    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
        System.out.println("-----------------------------------------------------------------------");
        for (int i = 0; i < N; i++) {
            System.out.print(i + ". " + biodataMahasiswa[i].nama + " ");
            System.out.print(biodataMahasiswa[i].alamat + " ");
            System.out.print(biodataMahasiswa[i].umur + " ");
            System.out.print(biodataMahasiswa[i].jekel + " ");
            System.out.print(biodataMahasiswa[i].hobi[0] + " ");
            System.out.print(biodataMahasiswa[i].hobi[1] + " ");
            System.out.print(biodataMahasiswa[i].hobi[2] + " ");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        formatBiodata biodataMahasiswa[] = new formatBiodata[N];
        for (int i = 0; i < N; i++) {
            biodataMahasiswa[i] = new formatBiodata();
        }

        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
}
