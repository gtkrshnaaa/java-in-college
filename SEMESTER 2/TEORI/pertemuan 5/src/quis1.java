public class quis1 {
    public static void main(String[] args) {
        int i ,j ,k ;
        i = 1;
        while (i < 3){
            j = 1;
            while ( j <= 4){
                k = 1;
                while ( k <= j){
                    int c = i + j + 2;
                    System.out.print(c+" ");
                    k++;
                }
                System.out.println();
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

