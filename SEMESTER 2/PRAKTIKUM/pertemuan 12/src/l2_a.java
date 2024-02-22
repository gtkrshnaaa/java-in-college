public class l2_a {
    public static void stringReverseRecursive(char[] arr, int index) {
        if (index < arr.length) {
            stringReverseRecursive(arr, index + 1);
            System.out.print(arr[index]);
        }
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        char[] charArray = input.toCharArray();

        System.out.println("Metode Rekursif:");
        stringReverseRecursive(charArray, 0);
    }
}
