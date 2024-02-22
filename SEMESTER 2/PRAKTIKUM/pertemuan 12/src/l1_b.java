// Metode Iterasi (printArrayIterative):

// Algoritma:

// Buat metode iteratif printArrayIterative yang menerima satu parameter: array bertipe integer.
// Lakukan perulangan dari 0 hingga panjang array dikurangi 1.
// Tampilkan elemen array pada indeks saat ini.


public class l1_b {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Metode Iterasi:");
        printArray(array);
    }
}

