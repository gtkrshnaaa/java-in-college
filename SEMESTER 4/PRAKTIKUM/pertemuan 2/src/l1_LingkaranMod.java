public class l1_LingkaranMod {
    final double phi = 3.14;
    double jari;

    public void setJari(double jari0) {
        this.jari = jari0;
    }

    public double jari() {
        return (jari);
    }

    public double luas() {
        double luas0;
        luas0 = phi * jari * jari;
        return (luas0);
    }

    public double diameter() {
        return (2 * jari());
    }

    public void tampil() {
        System.out.println("jari jari: " + jari);
        System.out.println("luas: " + luas());
        System.out.println("diameter: " + diameter());
    }

    public static void main(String[] args) {
        int i;
        l1_LingkaranMod[] a;
        a = new l1_LingkaranMod[5];
        for (i = 0; i < 5; i++) {
            a[i] = new l1_LingkaranMod();
        }
        a[0].setJari(00.00);
        a[1].setJari(10.00);
        a[2].setJari(20.00);
        a[3].setJari(30.00);
        a[4].setJari(40.00);

        for (i = 0; i < 5; i++) {
            if (a[i].jari() < 25.00) {
                System.out.println("Lingkaran ke: " + 1);
                a[i].tampil();
            }
        }
    }
}
