import java.util.LinkedList;

public class l1_tambahIntFloatLong {
    LinkedList daftarMhs = new LinkedList();

    l1_tambahIntFloatLong() {
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

        // Tambahkan Int Float Long
        daftarMhs.add(new Integer(10));
        daftarMhs.add(new Float(10.0));
        daftarMhs.add(new Long(10));

        System.out.println("N = " + daftarMhs.size());
        for (int i = 0; i <= daftarMhs.size() - 1; i++) {
            System.out.println(i + "  " + daftarMhs.get(i));
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        new l1_tambahIntFloatLong();
    }
}