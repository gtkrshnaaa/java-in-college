import java.util.Scanner;
public class UlangDoL1Mod {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double c, hasil;
        int f;
        boolean running = true;
        String jawab;

        c=20;
        f=32;

        do {

            hasil = c*1.8+f;
            System.out.println(c+" celcius = "+hasil+" fahrenheit");
            System.out.print("Lanjutkan? (ya/tidak) ");
            jawab = inp.nextLine();
            c++;

            if (jawab.equalsIgnoreCase("tidak")){
                running = false;
                c-=1;
            }
        } 
        while (running); {
            

        }
        System.out.println("Anda telah melakukan konfersi dari 20 Celcius sampai "+c+"celcius");
    }
}

