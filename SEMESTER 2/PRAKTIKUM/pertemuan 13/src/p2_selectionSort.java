import java.util.Scanner;
public class p2_selectionSort {
    public void selectionShort(float larik2[]) {
        for (int i = 0; i < larik2.length; i++) {
            int min = i;
            for (int elemen = i + 1; elemen < larik2.length; elemen++) {
                if (larik2[min] > larik2[elemen]) 
                    min = elemen; 
            }
            tukar(larik2, min, i);
        }
    }

    public void tukar(float larik3[], int satu, int dua) {
        float temp;
        temp = larik3[satu];
        larik3[satu] = larik3[dua];
        larik3[dua] = temp;
    }
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        p2_selectionSort lrk = new p2_selectionSort();
        float nilai[] = new float[5];
        System.out.println("Masukan 5 buat data nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " : ");
            nilai[i] = masuk.nextFloat();
        }
        System.out.println("Data nilai yang dimasukan");
        for (int i = 0; i < 5; i++)
            System.out.println(nilai[i]);
        System.out.println("Data hasil pengurutan    ");
        lrk.selectionShort(nilai); 
        for (int i = 0; i < 5; i++) 
            System.out.println(nilai[i]);
    }
}
