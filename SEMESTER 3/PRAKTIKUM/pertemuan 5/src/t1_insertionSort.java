import java.util.Scanner;

public class t1_insertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int currentIndex = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert");
            System.out.println("2. View");
            System.out.println("3. Sort");
            System.out.println("4. Exit");
            System.out.print("Pilih menu (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah angka yang akan dimasukkan: ");
                    int count = scanner.nextInt();

                    if (count > numbers.length - currentIndex) {
                        System.out.println("Maaf, jumlah angka yang diminta terlalu besar untuk ukuran array.");
                        continue;
                    }

                    System.out.println("Masukkan " + count + " angka:");

                    for (int i = 0; i < count; i++) {
                        System.out.print("Angka ke-" + (i + 1) + ": ");
                        int num = scanner.nextInt();
                        numbers[currentIndex] = num;
                        currentIndex++;
                    }
                    break;
                case 2:
                    System.out.print("Data: ");
                    for (int i = 0; i < currentIndex; i++) {
                        System.out.print(numbers[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    if (currentIndex > 0) {
                        insertionSort(numbers, currentIndex);
                        System.out.println("Data telah diurutkan dengan metode Insertion Sort.");
                    } else {
                        System.out.println("Tidak ada data untuk diurutkan.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu (1-4).");
            }
        }
    }

    public static void insertionSort(int[] arr, int size) {
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }
}
