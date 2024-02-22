// public class soalUTS1 {
//     public static void main(String arg[]) {
//         int i,j,k;
//         for (i = 0; i < 2; i++) {
//             for (j = 1; j <= 2; j++) {
//                 for (k = 1; k <= j; k++) {
//                     if (k % 2 == 0)
//                     System.out.println(k);
//                     else
//                     System.out.println(j);
//                 }
//             }
//         }
        
//     }
// }

public class soalUTS1 {
    public static void main(String arg[]) {
        int i = 0;
        while (i < 2) {
            int j = 1;
            while (j <= 2) {
                int k = 1;
                while (k <= j) {
                    if (k % 2 == 0)
                        System.out.println(k);
                    else
                        System.out.println(j);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}

