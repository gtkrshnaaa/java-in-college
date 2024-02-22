public class tugas2 {
    public static void main(String[] args) {
        int brs = 1;
        while (brs <= 5) {
            int kol = 1;
            while (kol <= brs) { 
                System.out.print(kol);
                kol++;
            }
            System.out.println(); 
            brs++;
        }
        brs = 4;
        while (brs >= 1) { 
            int kol = 1;
            while (kol <= brs) {
                System.out.print(kol);
                kol++;
            }
            System.out.println();
            brs--;
        }
    }
}
