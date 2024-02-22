import java.util.ArrayList;

public class l2_modP2Arraylist {
    ArrayList<String> daftarMhs = new ArrayList<>();

    l2_modP2Arraylist() {
        if (daftarMhs.isEmpty()) {
            System.out.println("ArrayList kosong");
        } else {
            System.out.println("ArrayList isi");
        }
        daftarMhs.add("Agungbp");
        daftarMhs.add("Bambang");

        if (daftarMhs.isEmpty()) {
            System.out.println("ArrayList kosong");
        } else {
            System.out.println("ArrayList isi");
        }
    }

    public static void main(String args[]) {
        new l2_modP2Arraylist();
    }
}
