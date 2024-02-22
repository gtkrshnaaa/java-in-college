public class soalUAS1 {
    public static void main(String arg[]) {
        int i = 1;
        while (i < 3) {
            int j = 1;
            while (j <= 4) {
                int k = 1;
                while (k <= j) {
                    int c = i + j + 2;
                    System.out.print(c + " ");
                    k++;
                }
                System.out.println("");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}