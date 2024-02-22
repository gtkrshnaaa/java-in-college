import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Masukkan batas : ");
        int batas = inp.nextInt();

        int jumlah = 0;

        System.out.print("Deret : ");
        for (int i = 1; i <= batas; i += 2) {
            System.out.print(i + " ");
            if (i % 3 == 0) {
                jumlah += i;
            }
        }
        System.out.println("");
        System.out.println("Jumlah : " + jumlah);
    }
}



// Buat program untuk menampilkan deret bilangan ganjil dengan nilai awal 1 dan batas yang dimasukkan oleh user serta hitunglah jumlah deret tersebut tetapi hanya yang kelipatan 3 saja yang dihitung.