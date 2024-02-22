package kelasteori;

public class for4 {
    public static void main(String[] args) {
        
        // for
        int b,k;
        for (b=1; b<=3; b=b+1){
            for(k=1; k<=5; k=k+1){
                System.out.print(k+" ");
                k=k+1;
            }
            System.out.println(" ");
        }
        // end

    }
}

// cara kerja
// b = 1, 1 <= 3 -> T
//  k = 1, 1 <= 5 -> T
//  k = 3, 3 <= 5 -> T
//  k = 5, 5 <= 5 -> T 