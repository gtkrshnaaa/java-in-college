public class l2_GCDRekursif {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        int x = 12;
        int y = 18;
        int result = gcd(x, y);
        System.out.println("GCD dari " + x + " dan " + y + " adalah: " + result);
    }
}

// Fungsi gcd digunakan untuk mencari GCD dengan menggunakan pendekatan rekursif. Jika nilai y sama dengan 0, maka fungsi mengembalikan nilai x sebagai hasil GCD. Jika nilai y tidak sama dengan 0, maka fungsi akan memanggil dirinya sendiri dengan argumen y sebagai x dan x modulo y sebagai y. Proses ini berlanjut secara rekursif sampai nilai y menjadi 0.

// Di dalam metode main, program menginisialisasi dua bilangan x dan y dengan nilai yang diinginkan. Kemudian, memanggil fungsi gcd dengan argumen x dan y. Hasil GCD kemudian ditampilkan di output.

// Misalnya, jika menjalankan program dengan nilai x = 12 dan y = 18, maka program akan mencetak "GCD of 12 and 18 is: 6". Artinya, GCD dari 12 dan 18 adalah 6.

// Metode rekursif ini bekerja dengan mencari GCD secara berulang menggunakan operator modulo (%) untuk mendapatkan sisa pembagian antara x dan y. Metode ini memanfaatkan sifat bahwa GCD dari dua bilangan tidak berubah jika bilangan yang lebih besar digantikan dengan selisih antara bilangan tersebut dan bilangan yang lebih kecil. Proses rekursif berlanjut sampai salah satu bilangan menjadi 0, dan pada titik itu, bilangan yang tidak nol adalah GCD dari dua bilangan tersebut.