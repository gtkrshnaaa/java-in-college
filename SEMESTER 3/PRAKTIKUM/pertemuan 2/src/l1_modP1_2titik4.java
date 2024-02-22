import java.util.Scanner;

class formatBiodata { 
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class l1_modP1_2titik4 { 
    public static int N;
    
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan jumlah data (maksimum 15): ");
        N = masukan.nextInt();
        
        if (N > 15) {
            System.out.println("Jumlah data tidak valid. Data yang dimasukan maksimum 15.");
            return;
        }
        
        formatBiodata biodataMahasiswa[] = new formatBiodata[N];
        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
    
    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol=0;
        for (int i = 0; i < N; i++) {
            System.out.print("Silakan masukkan nama anda: ");
            biodataMahasiswa[i] = new formatBiodata();
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Silakan masukkan alamat anda: ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Silakan masukkan umur anda: ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda: ");
            try {
                bacaTombol = System.in.read();
            } catch (java.io.IOException e) {
            }
            biodataMahasiswa[i].jekel = (char) bacaTombol;
            System.out.println("Silakan masukkan hobi (maks 3): ");
            System.out.print("hobi ke-0: ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("hobi ke-1: ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("hobi ke-2: ");
            biodataMahasiswa[i].hobi[2] = masukan.next();
            System.out.print("Silakan masukkan IPK anda: ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
            System.out.println("");
        }
    }

    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("NAMA ALAMAT UMUR JEKEL HOBI1 HOBI2 HOBI3 IPK");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < N; i++) {
            System.out.print(biodataMahasiswa[i].nama + " ");
            System.out.print(biodataMahasiswa[i].alamat + " ");
            System.out.print(biodataMahasiswa[i].umur + " ");
            System.out.print(biodataMahasiswa[i].jekel + " ");
            System.out.print(biodataMahasiswa[i].hobi[0] + " ");
            System.out.print(biodataMahasiswa[i].hobi[1] + " ");
            System.out.print(biodataMahasiswa[i].hobi[2] + " ");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("-------------------------------------------------------------");
    }
}
