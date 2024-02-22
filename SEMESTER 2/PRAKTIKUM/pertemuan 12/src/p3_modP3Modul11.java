public class p3_modP3Modul11 {
    public static void main(String[] args) {
        long N = 5;
        long hasil = 1;
        
        for (long i = N; i > 1; i--) {
            hasil *= i;
            System.out.println("Faktorial " + i + " = " + hasil); 
        }
        
        System.out.println("Faktorial 1 = 1"); 
    }
}
