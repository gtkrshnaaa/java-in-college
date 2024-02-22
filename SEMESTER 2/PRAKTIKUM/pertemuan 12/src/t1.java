public class t1 {
    public static int pangkat(int A, int B) {
        int result = 1;
        for (int i = 0; i < B; i++) {
            result *= A;
        }
        return result;
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int hasil = pangkat(A, B);
        System.out.println(A + " pangkat " + B + " = " + hasil);
    }
}
