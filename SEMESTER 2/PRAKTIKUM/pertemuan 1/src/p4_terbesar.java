import java.util.Scanner;
public class p4_terbesar{
    public static void main (String arg[]){

        Scanner in=new Scanner(System.in);

        int nilai1, nilai2, nilai3;

        System.out.print("Masukkan nilai pertama ");
        nilai1=in.nextInt();

        System.out.print("Masukkan nilai kedua ");
        nilai2=in.nextInt();

        System.out.print("Masukkan nilai ketiga ");
        nilai3=in.nextInt();

        if ((nilai1>nilai2)&&(nilai1>nilai3))
        System.out.println("Nilai terbesar = "+nilai1);

        else if((nilai2>nilai1)&&(nilai2>nilai3))
        System.out.println("Nilai terbesar = "+nilai2);

        else
        System.out.println("Nilai terbesar = "+nilai3);
        
    }
}
