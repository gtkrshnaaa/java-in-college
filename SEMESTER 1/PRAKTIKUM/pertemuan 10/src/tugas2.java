import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        int bilAw, bilAk, jumlah = 0;

        System.out.print("Masukan bilangan awal = ");
        bilAw = inp.nextInt();

        System.out.print("Masukan bilangan akhir = ");
        bilAk = inp.nextInt();


        for (; bilAw <= bilAk; bilAw +=5){
        System.out.println(bilAw);
        jumlah += bilAw;
        }
        System.out.println("Jumlah : " +jumlah);
    }
}


