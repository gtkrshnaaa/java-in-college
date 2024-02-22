import java.util.Scanner;

public class praktik {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i, x;
        boolean ketemu;
        int data[] = {12, 20, 14, 9, 34};
        System.out.print("Masukan Data yang dicari = ");
        x = input.nextInt();
        ketemu = false;
        for (i = 0; i < 5; i++) {
            if (data[i] == x) {
                ketemu = !ketemu;
                break;
            }
        }
        if (ketemu)
            System.out.println("Data tersebut ada posisi ke-"+ (i + 1));
        else
            System.out.println("Data tidak ketemu !");
    }
}
