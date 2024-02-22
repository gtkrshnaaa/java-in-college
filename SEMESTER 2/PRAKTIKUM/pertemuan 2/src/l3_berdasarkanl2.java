public class l3_berdasarkanl2 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pengulangan Bersarang Membentuk Pola");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < n; k++) {
                
                System.out.print("* ");
            }
            System.out.println("akakom");
        }
    }
}
