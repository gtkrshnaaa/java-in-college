class Calculation {
    private int a, b, c;
    // method overloading dengan perbedaan jumlah parameter 
    void tambah (int a, int b) {
    System.out.println(a+b);
    }

    void tambah(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String args[]) {
        Calculation obj = new Calculation();
        obj.tambah(10, 10, 10);
        obj.tambah(20, 20);
    }
}