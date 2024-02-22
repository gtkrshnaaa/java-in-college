import java.util.LinkedList;

public class p7_trySet {
    LinkedList daftarMhs = new LinkedList();

    p7_trySet() {
        daftarMhs.add("Agungbp");
        daftarMhs.add("Bambang");
        daftarMhs.add("Cucuk");
        daftarMhs.add("Dion");
        daftarMhs.add("Ending");
        daftarMhs.add("Fifin");
        daftarMhs.add("Gesit");
        daftarMhs.add("Heru");
        daftarMhs.add("Irma");
        daftarMhs.add("Janti");
        System.out.println("");
        System.out.println("N = " + daftarMhs.size());
        for (int i = 0; i <= daftarMhs.size() - 1; i++) {
            System.out.println(i + "  " + daftarMhs.get(i));
        }
        System.out.println("");

        daftarMhs.set(0, "Parmin");

        System.out.println("N = " + daftarMhs.size());
        for (int i = 0; i <= daftarMhs.size() - 1; i++) {
            System.out.println(i + "  " + daftarMhs.get(i));
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        new p7_trySet();
    }
}