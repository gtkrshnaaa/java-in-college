// public class soal3_Responsi1 {
//     public static void main(String[] args) {
//     // Perulangan tingkat dua untuk mencetak pola segitiga terbalik
//     for (int i = 5; i >= 1; i--) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print(j+" ");
//         }
//         System.out.println();
//         }
//     }
// }

public class soal3_Responsi1 {
    public static void main(String[] args) {

        int i = 5;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
