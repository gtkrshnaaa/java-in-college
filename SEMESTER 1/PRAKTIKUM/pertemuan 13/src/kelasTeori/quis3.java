package kelasTeori;

public class quis3 {
    public static void main(String[] args) {
        int x = 1;

        do {
           int y = 8;
           do{
                if (x == 2)
                System.out.print(x + " ");
                else
                System.out.print(y + " ");
                y--;

            } while (y > x);
                System.out.println("");
                x++;

        }while (x <= 5);
    }
}



