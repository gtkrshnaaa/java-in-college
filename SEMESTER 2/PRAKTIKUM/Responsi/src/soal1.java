public class soal1 {
    public static void bubbleSort(int array[]) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {15, 20, 42, 71, 16, 3, 20};
        System.out.println("Data sebelum diurutkan:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        bubbleSort(array);

        System.out.println("\nData setelah diurutkan:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
