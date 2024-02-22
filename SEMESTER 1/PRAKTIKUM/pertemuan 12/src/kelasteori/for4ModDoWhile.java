package kelasteori;

public class for4ModDoWhile {
    public static void main(String[] args) {
        int b,k;
        b =1;
        do {
            k =1;
            do{
                System.out.print(k+" ");
                k = k+1;
                k = k+1;
            }
            while (k <= 5);
            System.out.println(" ");
            b = b+1;
        }
        while (b<=3);
    }
}
