import java.util.Scanner;
public class modul8Latihan {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
           
            int nilaiAwal, nilaiAkhir;
            System.out.print("Masukkan nilai awal = ");
            nilaiAwal = input.nextInt();
            System.out.print("Masukkan nilai akhir = ");
            nilaiAkhir = input.nextInt();
            System.out.println(".....................");

            
            while(nilaiAwal <= nilaiAkhir) {
               
               if (nilaiAwal % 2 == 0){
               System.out.println("Bilangan ke-"+nilaiAwal);
            }
            nilaiAwal ++;
            
         } 
          
       }
    }

