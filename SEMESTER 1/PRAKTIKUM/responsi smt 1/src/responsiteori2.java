public class responsiteori2 {
    public static void main(String[] args) {
        int x, y;

        for (x=1; x <= 6; x+=2) {
            int jum = 0;
            for ( y = x; y <= 3; y++) {
                jum = jum + y;
                System.out.print(y + " ");
            }
            System.out.println(jum);
        }
    }
}
