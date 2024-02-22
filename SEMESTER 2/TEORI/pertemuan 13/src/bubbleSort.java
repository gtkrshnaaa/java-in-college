public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 10, 4, 2, 8, 19, 7};
        System.out.println("Sebelum diurutkan:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSetelah diurutkan dengan Bubble Sort:");
        printArray(arr);
        System.out.println(" ");
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
