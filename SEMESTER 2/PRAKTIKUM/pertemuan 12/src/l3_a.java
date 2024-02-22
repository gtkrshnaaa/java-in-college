public class l3_a {
    public static int recursiveMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            return Math.min(arr[n - 1], recursiveMinimum(arr, n - 1));
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 2, 7, 1, 6};
        int n = arr.length;

        int smallest = recursiveMinimum(arr, n);
        System.out.println("Elemen terkecil dalam array: " + smallest);
    }
}
