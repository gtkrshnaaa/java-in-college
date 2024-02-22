import java.util.LinkedList;

public class p1_tryIsEmpty {
    LinkedList daftarMhs = new LinkedList();

    p1_tryIsEmpty() {
        if (daftarMhs.isEmpty() == true) {
            System.out.println("Linkedlist kosong");
        } else {
            System.out.println("Linkedlist isi");
        }
    }

    public static void main(String args[]) {
        new p1_tryIsEmpty();
    }
}