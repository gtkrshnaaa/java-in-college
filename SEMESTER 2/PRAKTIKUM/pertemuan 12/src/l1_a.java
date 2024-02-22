// Metode Rekursif (printArrayRecursive):

// Algoritma:

// Buat metode rekursif printArrayRecursive yang menerima dua parameter: array bertipe integer dan indeks.
// Jika indeks kurang dari panjang array, lakukan langkah-langkah berikut:
// Tampilkan elemen array pada indeks saat ini.
// Panggil metode printArrayRecursive dengan nilai indeks yang ditambah 1.
// Jika indeks sama dengan atau lebih besar dari panjang array, berhentikan rekursi.

public class l1_a {
    public static void printArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.println(arr[index]);
            printArray(arr, index + 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Metode Rekursif:");
        printArray(array, 0);
    }
}
