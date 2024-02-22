import java.util.Scanner;
public class praktik4 {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        System.out.print("Menampilkan tulisan 'STIMIK AKAKOM' sebanyak : ");
        int banyak, kata = 0;
        banyak = inp.nextInt();

        do {
            System.out.println("STIMIK AKAKOM");
            kata++;
        } while (kata < banyak);
    }
}


