import java.util.LinkedList;

public class p2_tryAdd {
    LinkedList daftarMhs = new LinkedList();

    p2_tryAdd() {
        if (daftarMhs.isEmpty() == true) {
            System.out.println("Linkedlist kosong");
        } else {
            System.out.println("Linkedlist isi");
        }
        daftarMhs.add("Agungbp");
        daftarMhs.add("Bambang");

        if (daftarMhs.isEmpty() == true) {
            System.out.println("Linkedlist kosong");
        } else {
            System.out.println("Linkedlist isi");
        }
    }

    public static void main(String args[]) {
        new p2_tryAdd();
    }
}