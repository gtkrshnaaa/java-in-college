// public class quisSoal1{
// public static void main(String arg[]) {
//   int i,j,k;
//   for(i=1;i<3;i++)
//   {
//   	  for(j=1;j<=4;j++)
//   	  {
//         for(k=1;k<=j;k++)
//         {
// 			int c=i+j+2;
// 			System.out.print(c+" ");
// 	    }
// 	    System.out.println("");
//       }
//       System.out.println("");
//   }}}

// Ubahlah program di atas ke dalam perulangan menggunakan statement while !	



public class quisSoal1 {
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
