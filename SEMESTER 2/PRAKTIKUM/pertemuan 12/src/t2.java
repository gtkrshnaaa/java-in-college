public class t2 {
    public static boolean isPalindrome(String input) {
        // Menghapus spasi dan tanda baca dalam string
        String cleanInput = input.replaceAll("[\\s\\p{Punct}]", "");

        // Mengonversi string ke lowercase untuk membandingkan karakter tanpa memperhatikan case
        String lowercaseInput = cleanInput.toLowerCase();

        int left = 0;
        int right = lowercaseInput.length() - 1;

        while (left < right) {
            if (lowercaseInput.charAt(left) != lowercaseInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "Radar";
        boolean isPalindrome = isPalindrome(input);
        System.out.println("\"" + input + "\" adalah palindrome? : " + isPalindrome);
    }
}
