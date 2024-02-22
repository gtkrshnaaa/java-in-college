import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int nilai;
        System.out.print("Masukkan angka bulat (0 - 100) ");
        nilai = in.nextInt();
        if (nilai >= 80) {
            System.out.println("Nilaimu bagus sekali");
        }
        else if (nilai >= 60) {
            System.out.println("Nilaimu bagus");
        }
        else {
            System.out.println("Nialaimu kurang");
        }
    }
}
