public class t1_palindromeCheker {
    public static boolean testPalindrome(String str) {
        // Mengabaikan spasi dan tanda baca dalam string
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        // Panggil metode rekursif untuk memeriksa palindrom
        return isPalindrome(str, 0, str.length() - 1);
    }
    
    private static boolean isPalindrome(String str, int start, int end) {
        // Base case: jika hanya ada satu karakter atau tidak ada karakter
        if (start >= end) {
            return true;
        }
        
        // Memeriksa apakah karakter pertama dan terakhir sama
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        
        // Memanggil metode rekursif untuk memeriksa substring yang lebih pendek
        return isPalindrome(str, start + 1, end - 1);
    }
    
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = testPalindrome(str);
        
        System.out.println("Apakah \"" + str + "\" merupakan palindrom? " + isPalindrome);
    }
}


// Program di atas adalah sebuah implementasi dalam bahasa Java untuk memeriksa apakah sebuah string merupakan palindrom atau bukan. Program ini menggunakan metode rekursif yang disebut `testPalindrome` untuk melakukan pengecekan. Pertama, string input diubah menjadi lowercase dan semua spasi serta tanda baca dihapus. Kemudian, metode rekursif `isPalindrome` dipanggil untuk memeriksa apakah string tersebut merupakan palindrom. Dalam metode `isPalindrome`, karakter pertama dan terakhir dari string dibandingkan. Jika tidak sama, maka string tersebut bukan palindrom. Namun, jika karakter pertama dan terakhir sama, metode `isPalindrome` dipanggil secara rekursif untuk memeriksa bagian tengah yang lebih pendek dari string. Hal ini dilakukan sampai semua karakter dipasangkan dengan benar atau ditemukan ketidaksamaan. Pada akhirnya, hasil dari pengecekan palindrom dicetak dalam bentuk boolean `true` atau `false`.