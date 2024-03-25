public class l1_calculator {

    // Metode tambah() dengan tiga macam overloading
    public int tambah() { return 0; }
    public double tambah(double a) {return 2 * a;}
    public double tambah(double a, double b) {return a + b;}
    public String tambah(String a, String b) {return a + b;}
    // Tiga metode tambah tambahan
    public int tambah(int a, int b, int c) {return a + b + c;}
    public double tambah(int a, double b) {return a + b;}
    public String tambah(String a, int b) {return a + Integer.toString(b);}


    // Metode kali() dengan lima macam overloading
    public int kali(int a, int b) {return a * b;}
    public double kali(double a, double b) {return a * b;}
    public int kali(int a, int b, int c) {return a * b * c;}
    public double kali(double a, int b) {return a * b;}
    public double kali(int a, double b) {return a * b;}

    // Metode kurang() dengan lima macam overloadng
    public int kurang(int a, int b) {return a - b;}
    public double kurang(double a, double b) {return a - b;}
    public int kurang(int a, int b, int c) {return a - b - c;}
    public double kurang(double a, int b) {return a - b;}
    public double kurang(int a, double b) {return a - b;}

    public static void main(String[] args) {
        l1_calculator calculator = new l1_calculator();

        // Contoh pemanggilan metode tambah()
        System.out.println("Hasil tambah tanpa parameter: " + calculator.tambah());
        System.out.println("Hasil tambah satu double: " + calculator.tambah(5.0));
        System.out.println("Hasil tambah dua double: " + calculator.tambah(3.0, 4.0));
        System.out.println("Hasil tambah dua string: " + calculator.tambah("Hello", " World"));
        System.out.println("Hasil tambah tiga integer: " + calculator.tambah(3, 4, 5));
        System.out.println("Hasil tambah satu integer dan satu double: " + calculator.tambah(5, 2.5));
        System.out.println("Hasil tambah satu string dan satu integer: " + calculator.tambah("Hello ", 42));

        // Contoh pemanggilan metode kali()
        System.out.println("Hasil kali dua integer: " + calculator.kali(3, 4));
        System.out.println("Hasil kali dua double: " + calculator.kali(2.5, 3.5));
        System.out.println("Hasil kali tiga integer: " + calculator.kali(2, 3, 4));
        System.out.println("Hasil kali double dan integer: " + calculator.kali(2.5, 3));
        System.out.println("Hasil kali integer dan double: " + calculator.kali(3, 2.5));

        // Contoh pemanggilan metode kurang()
        System.out.println("Hasil kurang dua integer: " + calculator.kurang(5, 3));
        System.out.println("Hasil kurang dua double: " + calculator.kurang(4.5, 2.5));
        System.out.println("Hasil kurang tiga integer: " + calculator.kurang(10, 3, 2));
        System.out.println("Hasil kurang double dan integer: " + calculator.kurang(5.5, 2));
        System.out.println("Hasil kurang integer dan double: " + calculator.kurang(7, 2.5));
    }
}

