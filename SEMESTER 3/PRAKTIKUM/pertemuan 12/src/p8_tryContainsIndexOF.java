import java.util.LinkedList;

public class p8_tryContainsIndexOF {
    LinkedList daftarMhs = new LinkedList();

    p8_tryContainsIndexOF() {
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
        System.out.println("N = " + daftarMhs.size());
        for (int i = 0; i <= daftarMhs.size() - 1; i++) {
            System.out.println(i + "  " + daftarMhs.get(i));
        }
        System.out.println("");

        System.out.println(daftarMhs.contains("Heru"));
        System.out.println("Heru berada di posisi ke = " +
                daftarMhs.indexOf("Heru"));
        System.out.println("");
    }

    public static void main(String args[]) {
        new p8_tryContainsIndexOF();
    }
}