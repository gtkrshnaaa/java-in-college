import java.util.Scanner;
public class kelasTeori2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
           
            int nilaiAwal, nilaiAkhir;
            nilaiAwal=1;
            System.out.println("Nilai awal = " + nilaiAwal);
            System.out.print("Masukkan nilai akhir = ");
            nilaiAkhir = input.nextInt();
            System.out.println(" ");

            do {
                if (nilaiAwal % 2 == 1){
                    System.out.println(nilaiAwal);
                }
                nilaiAwal ++;
            }
            while(nilaiAwal <= nilaiAkhir);
               
          
       }
    }


