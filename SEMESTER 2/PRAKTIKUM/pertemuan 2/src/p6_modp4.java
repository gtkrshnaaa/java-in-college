
public class p6_modp4 {
    public static void main(String[] args) {
        int x = 5;
        int i = 1;
        do {
            int j = x - i;
            do {
                System.out.print(' ');
                j--;
            } while (j >= 0);

            int k = 1;
            do {
                System.out.print('*');
                k++;
            } while (k <= 2 * i - 1);

            System.out.println();
            i++;
        } while (i <= x);
    }
}
// //Penjelasan singkat:

// Pada baris ke-4, int j = x - i digunakan untuk menghitung jumlah spasi yang diperlukan sebelum menampilkan bintang.
// Pada baris ke-6, j >= 0 digunakan untuk memastikan loop akan berjalan selama masih ada spasi yang perlu ditampilkan.
// Pada baris ke-8, k <= 2 * i - 1 digunakan untuk menentukan jumlah bintang yang perlu ditampilkan pada setiap baris. 2 * i - 1 digunakan karena jumlah bintang pada setiap baris berbeda dan berurutan ganjil (1, 3, 5, 7, 9, dst.).
