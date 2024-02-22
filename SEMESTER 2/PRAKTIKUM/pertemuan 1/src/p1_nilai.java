import java.util.Scanner;

public class p1_nilai{
    public static void main (String arg[]){
    Scanner in=new Scanner(System.in);
    int nilai;

    System.out.print("Masukkan angka bulat (0 - 100) ");
    nilai=in.nextInt();
    if (nilai>=60){
        if (nilai>=80)
        System.out.println("Nilaimu bagus sekali ");
        else
        System.out.println("Nilaimu bagus ");
    }
    else
    System.out.println("Nilaimu kurang ");
    }
}
