import java.util.Scanner;
public class modul5_T2{
    public static void main(String[] args){
		System.out.println("Menentukan jenis segitiga berdasarkan sisi-sisinya.");
       	Scanner input = new Scanner(System.in);

        int   sisiA;
        int   sisiB;
        int   sisiC;


        System.out.print("Masukkan sisi A : ");
        sisiA = input.nextInt();

        System.out.print("Masukkan sisi B : ");
        sisiB = input.nextInt();

        System.out.print("Masukkan sisi C : ");
        sisiC = input.nextInt();

        if(sisiA==sisiB)
         {
          if(sisiB==sisiC)
           System.out.println("Segita Sama Sisi");
          else
           System.out.println("Segitiga Sama Kaki");
         }
        else
         {
          if(sisiA==sisiC)
           System.out.println("Segitiga Sama Kaki");

          else
          {
           if(sisiB==sisiC)
            System.out.println("Segitiga Sama Kaki");
           else
            if(sisiB==sisiC)
             System.out.println("Segitiga Sama Kaki");
            else
             System.out.println("Segitiga Sembarang");
          }
         }
    }
}