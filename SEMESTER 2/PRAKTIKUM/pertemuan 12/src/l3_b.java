public class l3_b {
    public static int iterativeMinimum(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 1, 6};

        int smallest = iterativeMinimum(arr);
        System.out.println("Elemen terkecil dalam array: " + smallest);
    }
}
