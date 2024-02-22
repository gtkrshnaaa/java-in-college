import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        int bil, total = 0;

        for (bil = 0; bil < 20; bil++){
            System.out.print(bil+ " ");

            total += bil;
        }
        System.out.println("Jumlah = "+total);
    }
}



