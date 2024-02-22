public class t1_loopingWhile {
    public static void main(String[] args) {
        int row = 1;
        while (row <= 5) {
            int col = 1;
            while (col <= row) { 
                System.out.print(col);
                col++;
            }
            System.out.println(); 
            row++;
        }
        row = 4;
        while (row >= 1) { 
            int col = 1;
            while (col <= row) {
                System.out.print(col);
                col++;
            }
            System.out.println();
            row--;
        }
    }
}
