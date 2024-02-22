package kelasTeori;
import java.util.Scanner;


public class quis2 {
    public static void main(String[] args) {

        Scanner inp = new Scanner (System.in);

        boolean running = true;
        int hkelas = 1, ttlHarga = 0, jtiket;
        String kelas, jawab;
        
        while (running) {
            System.out.print("Masukan kelas tiket yang anda beli (Ekonomi/ Bisnis/ Eksekutif) : ");
            kelas = inp.next();
            
    
            System.out.print("Masukan jumlah tiket yang anda beli : ");
            jtiket = inp.nextInt();
        
            switch (kelas) {

                case "Ekonomi" :
                hkelas = jtiket * 70000;
                System.out.println("Jumlah tiket kelas Ekonomi yang anda beli = " +jtiket);
                System.out.println("Dengan total harga = " + hkelas);
                break;

                case "Bisnis" :
                hkelas = jtiket * 175000;
                System.out.println("Jumlah tiket kelas Bisnis yang anda beli = " + jtiket);
                System.out.println("Dengan total harga = " + hkelas);
                break;

                case "Eksekutif" :
                hkelas = jtiket * 420000;
                System.out.println("Jumlah tiket kelas Eksekutif yang anda beli = " + jtiket);
                System.out.println("Dengan total harga = " + hkelas);
                break;

                default:
                    System.out.println("Salah masukan pilihan kelas tiket.");
                break;
                
                    
            }
            

            System.out.println("Beli tiket lagi? (ya/tidak)");
            jawab = inp.next();

            ttlHarga = hkelas + ttlHarga;

            if (jawab.equalsIgnoreCase("tidak")){
                running = false;

                if (ttlHarga >= 1000000 && ttlHarga <= 1500000){
                    ttlHarga = ttlHarga - ttlHarga * 10/100;
                }
                else if (ttlHarga > 1500000){
                    ttlHarga = ttlHarga - ttlHarga * 15/100;
                }
            }
            
            
        }
        System.out.println("Total harga tiket yang harus anda bayar adalah = "+ttlHarga);
        
    }
}




