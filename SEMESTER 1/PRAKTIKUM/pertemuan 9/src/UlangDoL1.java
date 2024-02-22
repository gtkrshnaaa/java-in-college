public class UlangDoL1 {
    public static void main(String[] args) {
        double c, hasil;
        int f;

        c=20;
        f=32;

        do {

            hasil = c*1.8+f;
            System.out.println(c+" celcius = "+hasil+" fahrenheit");
            c++;
        } while (c <=30);
    }
}
