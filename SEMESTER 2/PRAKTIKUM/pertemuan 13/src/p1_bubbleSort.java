
import java.util.Scanner;
public class p1_bubbleSort {

     public void bubbleSort(float larik2[]) {
        for (int i = 0; i < larik2.length; i++) {
            for (int elemen = 0; elemen < larik2.length - 1; elemen++) {
                if (larik2[elemen] > larik2[elemen + 1])
                    tukar (larik2, elemen, elemen + 1);
            }
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
        p1_bubbleSort lrk = new p1_bubbleSort();
        float nilai[] = new float[5];
        System.out.println("masukan 5 buat data nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " : ");
            nilai[i] = masuk.nextFloat();
        }

        System.out.println("Data nilai yang dimasukan");
        for (int i = 0; i < 5; i++) 
            System.out.println(nilai[i]);
        System.out.println("Data hasil pengurutan");
        lrk.bubbleSort(nilai);
        for (int i = 0; i < 5; i++) {
            System.out.println(nilai[i]);
        }

     }

}
