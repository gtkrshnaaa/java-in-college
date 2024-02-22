public class l1_pangkatRekursif {
    public static void main(String[] args) {
        int A = 5;
        int B = 3;
        int hasil = pangkat(A, B);
        System.out.println(A + "^" + B + " = " + hasil);
    }
    
    public static int pangkat(int A, int B) {
        if (B == 0) {
            return 1; // Basis rekursif: A^0 = 1
        } else {
            return A * pangkat(A, B - 1); // Rekurens: A^B = A * A^(B-1)
        }
    }
}

// Dalam program ini, saya menggunakan method pangkat untuk menghitung nilai A^B secara rekursif. Jika pangkat B adalah 0, maka hasilnya adalah 1 (basis rekursif). Jika pangkat B bukan 0, maka A dikalikan dengan pangkat(A, B-1) (rekurens) untuk mendapatkan hasil pangkat. Pada program di atas, nilai A adalah 5 dan nilai B adalah 3, sehingga program akan mencetak hasil 5^3 = 125.

