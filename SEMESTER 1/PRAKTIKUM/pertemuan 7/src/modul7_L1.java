import java.util.Scanner;
public class modul7_L1 {
    public static void main(String[] args)  {
                Scanner input = new Scanner (System.in);
                int pil;
                
                System.out.println("Masukkan pilihan harga mobil/ motor ");
                System.out.println("Ketik 1 untuk pilhan mobil");
                System.out.println("Ketik 2 untuk pilhan motor");
                System.out.print("Masukan pilihan = ");
                
                pil = input.nextInt();
               

                if (pil == 1) {
                    int merk;
                    System.out.println("masukkan nama motor pilihan : jazz (1) / brio (2) / mobilio (3)");
                    System.out.print("Masukkan pilihan = ");
                    merk = input.nextInt();
                    if (merk == 1)
                        System.out.println("Jazz 170 jt");
                    else if (merk == 2)
                        System.out.println("Brio 120 jt");
                    else if (merk == 3)
                        System.out.println("Mobilio 170 jt");
                    else 
                        System.out.println("Salah masukan mobil pilihan");

                    } else if( pil == 2) {
                    int merk;
                    System.out.println("masukkan nama mobil pilihan : Vario (1) / Beat (2) / Vixion (3)");
                    System.out.print("Masukkan pilihan = ");
                    merk = input.nextInt();
                    if (merk == 1)
                        System.out.println("Vario 16 jt");
                    else if (merk == 2)
                        System.out.println("Beat 14 jt");
                    else if (merk == 3)
                        System.out.println("Vixion 20 jt");
                    else 
                        System.out.println("Salah masukan motor pilihan");
                    }
                    else
                    System.out.println("Salah masukan pilihan");
            


        }

 }
        
    
