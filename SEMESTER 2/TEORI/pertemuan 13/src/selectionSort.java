public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 10, 4, 2, 8, 19, 7};
        System.out.println("Sebelum diurutkan:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nSetelah diurutkan dengan Selection Sort:");
        printArray(arr);
        System.out.println(" ");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
