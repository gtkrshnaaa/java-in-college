public class t1_deretPola {
    public static void main(String[] args) {
        int jmlSuku = 4;
        int jmlSukuSebelumnya = 0;
        int totalSuku = 0;
        for(int suku=1; suku<=jmlSuku; suku++){
            totalSuku++;
            jmlSukuSebelumnya += suku;
            System.out.print(" " + suku);
            if (totalSuku == 2){
                System.out.print( " " + jmlSukuSebelumnya);
                totalSuku = 0;
                jmlSukuSebelumnya = 0;
            }
        }
    }
}


// Program inimerupakan program yang menggunakan konsep seleksi dalam perulangan untuk menghasilkan deret dengan pola (1,2,3,3,4,7) saya menggunakan aturan suku ke-n = suku ke-(n-2) + suku ke-(n-1), ini saya ambil dari ketentuan suku ketiga dan ke 6 yang mana tertulis pada soal tugas dalam modul.

// Program ini menggunakan variabel jmlSuku untuk menyimpan jumlah suku yang akan dicetak, jmlSukuSebelumnya untuk menghitung jumlah dua suku sebelumnya, dan totalSuku untuk menghitung jumlah suku yang sudah dicetak dalam satu iterasi.

// Selanjutnya, program melakukan perulangan untuk mencetak suku-suku sebanyak jmlSuku. Pada setiap iterasi, program mencetak suku ke-n (variabel suku) dan menambahkan suku ke jmlSukuSebelumnya. Jika totalSuku sudah mencapai 2, program mencetak jmlSukuSebelumnya dan mengembalikan nilai jmlSukuSebelumnya dan totalSuku ke 0.