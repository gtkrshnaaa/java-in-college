import java.util.Scanner;

class Mahasiswa{
    String nama;
    char jekel;
    int NIM;
    double IPK;
}
class tugas {
    static int N = 3;
    static Scanner masukan = new Scanner(System.in);

    static void inputData(Mahasiswa dtaMhs[]){
        for (int i = 0; i < N; i++) {
            System.out.print("masukan nama anda : ");
            dtaMhs[i].nama = masukan.next();

            System.out.print("masukan jenis kelamin anda : ");
            dtaMhs[i].jekel = masukan.next().charAt(0);

            System.out.print("masukan NIM anda : ");
            dtaMhs[i].NIM = masukan.nextInt();

            System.out.print("masukan IPK anda : ");
            dtaMhs[i].IPK = masukan.nextDouble();
        }
    }

    static void tampilkanData(Mahasiswa dataMhs[], char jekel){
        System.out.println("--------------------------------------------");
        System.out.println("Nama\tJekel\t\tNIM\t\tIPK");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < N; i++) {
            if (dataMhs[i].jekel == jekel){
                System.out.println(dataMhs[i].nama + "\t" + dataMhs[i].jekel + "\t" 
                + dataMhs[i].NIM + "\t" + dataMhs[i].IPK);
            }
        }
    }

    public static void main(String[] args) {
        Mahasiswa dataMhs[] = new Mahasiswa[5];
        for (int i = 0; i < dataMhs.length; i++) {
            dataMhs[i] = new Mahasiswa();
        }

        inputData(dataMhs);

        System.out.print("masukan jenis kelamin yang ingin dicari : ");
        char jekel = masukan.next().charAt(0);

        tampilkanData(dataMhs, jekel);

    }
}
