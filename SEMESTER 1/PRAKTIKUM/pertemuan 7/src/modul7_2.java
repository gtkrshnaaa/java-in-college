import java.util.Scanner;
public class modul7_2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int nilai;
            System.out.println("Masukkan angka bulat (0 - 60) ");
            nilai=in.nextInt();
            if (nilai<60){
                if (nilai>=30)
                System.out.println("Nilaimu kurang ");
                else if (nilai < 30)
                System.out.println("Nilaimu jelek ");
            } else
                 System.out.println("Salah masukkan nilai");

    }
}


