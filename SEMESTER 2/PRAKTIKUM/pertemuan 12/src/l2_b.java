public class l2_b {
    public static void stringReverseIterative(char[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        char[] charArray = input.toCharArray();

        System.out.println("Metode Iteratif:");
        stringReverseIterative(charArray);
    }
}
