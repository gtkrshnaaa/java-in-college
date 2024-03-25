public class t1_LingkaranMod {
    final double phi = 3.14;
    double jari;

    public void setJari(double jari0) {
        this.jari = jari0;
    }

    public double jari() {
        return jari;
    }

    public double luas() {
        double luas0;
        luas0 = phi * jari * jari;
        return luas0;
    }

    public double diameter() {
        return 2 * jari();
    }

    public double keliling() {
        return 2 * phi * jari;
    }

    public void tampil() {
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + luas());
        System.out.println("Diameter: " + diameter());
        System.out.println("Keliling: " + keliling());
    }

    public static void main(String[] args) {
        int i;
        t1_LingkaranMod[] a;
        a = new t1_LingkaranMod[5];
        for (i = 0; i < 5; i++) {
            a[i] = new t1_LingkaranMod();
        }
        a[0].setJari(00.00);
        a[1].setJari(10.00);
        a[2].setJari(20.00);
        a[3].setJari(30.00);
        a[4].setJari(40.00);

        System.out.println("Lingkaran dengan diameter di bawah 60:");
        for (i = 0; i < 5; i++) {
            if (a[i].diameter() < 60.00) {
                a[i].tampil();
            }
        }

        System.out.println("\nLingkaran dengan luas antara 100 sampai 1000:");
        for (i = 0; i < 5; i++) {
            if (a[i].luas() >= 100 && a[i].luas() <= 1000) {
                a[i].tampil();
            }
        }

        System.out.println("\nLingkaran dengan keliling antara 100 sampai 500:");
        for (i = 0; i < 5; i++) {
            if (a[i].keliling() >= 100 && a[i].keliling() <= 500) {
                a[i].tampil();
            }
        }
    }
}
