import java.util.Scanner;
public class modul8tugas1 {
 public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    int i, n;
    float jum, x, ratarata;

    System.out.println("Banyaknya data : ");
    n = input.nextInt();
    jum = 0;
    i = 1;

    while (i<=n) {
        System.out.print("Data ke-" +i+ " ");
        x = input.nextFloat();
        jum += x;
        i++;
    }
    ratarata = jum/n;
    System.out.println("Rata-rata : "+ratarata);
    System.out.println("Jumlah : "+jum);
 }   
}
