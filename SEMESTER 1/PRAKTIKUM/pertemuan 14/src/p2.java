import java.util.Scanner;
public class p2 {
    public static void main (String [] args) {
        Scanner inp = new Scanner (System.in);

        double R, R1, R2, R3;
        

        System.out.print ("Masukan nilai R1 : ");
        R2 = inp.nextDouble();

        System.out.print("Masukan nilai R2 : ");
        R1 = inp.nextDouble();

        System.out.print("Masukan nilai R3 : ");
        R3 = inp.nextDouble();

        R = 1/(1/R1+1/R2+1/R3);

        System.out.print("Maka nilai R adalah : " + R);
    }
}

// Program ini merupakan program Java yang digunakan untuk menghitung nilai R menggunakan rumus R = 1/(1/R1+1/R2+1/R3). Program ini akan meminta user untuk memasukkan nilai R1, R2, dan R3 melalui keyboard, kemudian menghitung nilai R dengan menggunakan rumus tersebut, dan akhirnya menampilkan hasilnya ke layar. Program ini menggunakan kelas Scanner untuk membaca input dari keyboard dan tipe data double untuk menyimpan bilangan desimal.