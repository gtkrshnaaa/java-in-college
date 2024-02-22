import java.util.Scanner;
public class modul8_3 {
    public static void main(String[] args) {
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scan = new Scanner (System.in);
            while (running){
                System.out.println("STIMIK AKAKOM");
                System.out.print("Tampilkan tulisan lagi [ya/tidak]> ");
                jawab = scan.nextLine();
                // cek jawabanya, kalai ya maka berhenti mengulang
                if(jawab.equalsIgnoreCase("tidak")){
                    running = false;
                }
                counter++;
            }
        
            System.out.println("Anda sudah melakukan pengulangan sebanyak " + counter + " kali");
    }
}
