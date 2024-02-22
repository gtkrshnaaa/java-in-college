public class p2_fibonacciRekursif {
    public static long fibonacci(long N) {
        if ((N == 0) || (N == 1))
            return N;
        else
            return fibonacci(N - 1) + fibonacci( N - 2);
    }

    public static void main(String[] args) {
        System.out.println("Deret fibonacci dengan N = 3");
        for (int i = 0; i <= 3; i++)
        if (i < 3)
            System.out.println(fibonacci(i) + ", ");
        else 
            System.out.println(fibonacci(i));
    }
}
