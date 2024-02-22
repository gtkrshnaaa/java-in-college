import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int pilihan, fn, fn1, fn2, fk, n;

        System.out.println("Menu pilihan");
        System.out.println("1. Fibonaci");
        System.out.println("2. Faktorial");
        System.out.print(" Masukan Pilihan anda = ");
        pilihan = inp.nextInt();


        if (pilihan == 1) {

            System.out.print("Masukan jum deret : ");
            n = inp.nextInt();
            
            fn2 = 0;
            fn1 = 1;
            fn = 1;

            for(int i = 1; i <= n; i++) {
                System.out.print(fn + " ");
                fn = fn1 + fn2;
                fn2 = fn1;
                fn1 = fn;
            }
        }
        else {

            System.out.println("Masukan faktorial = ");
            n = inp.nextInt();

            fk = 1;

            for (int i = 1; i <= n; i++) {
                fk *= i;
            }
            System.out.println(fk);

        }

    }
}






