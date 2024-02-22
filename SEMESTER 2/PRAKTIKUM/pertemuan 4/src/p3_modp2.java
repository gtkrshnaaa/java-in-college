import java.util.Scanner;

public class p3_modp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kucing: ");
        int numCats = input.nextInt();
        
        String cats[][]= new String[numCats][2];
        
        for (int i=0;i<numCats;i++) {
            System.out.print("Masukkan nama kucing ke-" + (i+1) + ": ");
            cats[i][0] = input.next();
            System.out.print("Masukkan warna kucing ke-" + (i+1) + ": ");
            cats[i][1] = input.next();
        }
        
        System.out.println("Nama Kucing\tWarna");
        for (int i=0;i<cats.length;i++) {
            for (int j=0;j<cats[i].length;j++) {
                System.out.print(cats[i][j]);
                System.out.print("\t\t");
            }
            System.out.println(" ");
        }
        
        
    }
}
