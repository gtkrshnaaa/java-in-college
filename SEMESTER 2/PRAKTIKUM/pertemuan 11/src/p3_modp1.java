public class p3_modp1 {
    // method rekursif
    public static long faktorial(long N) {
        if (N <= 1) { // kondisi terpenuhi untuk akhir rekursif
            System.out.println("Faktorial " + N + " = 1"); // cetak hasil faktorial
            return 1; // nilai akhir: 0! = 1 dan 1! = 1
        } else { // step rekursif, ada pemanggilan kembali method 'faktorial'
            long hasil = N * faktorial(N - 1);
            System.out.println("Faktorial " + N + " = " + hasil); // cetak hasil faktorial
            return hasil;
        }
    }

    public static void main(String[] args) {
        // pemanggilan awal method faktorial
        faktorial(5);
    }
}

// Dalam modifikasi di atas, saya menambahkan pernyataan System.out.println untuk mencetak hasil faktorial setiap kali metode faktorial dipanggil secara rekursif. Hasil faktorial setiap bilangan akan dicetak dengan urutan dari bilangan terkecil hingga bilangan terbesar. Dalam contoh ini, faktorial dari 1 hingga 5 akan dicetak dalam urutan tersebut.