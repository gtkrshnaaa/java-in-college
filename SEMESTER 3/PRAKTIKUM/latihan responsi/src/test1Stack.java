import java.util.Scanner;

public class test1Stack {
    public static int N = 5;
    public static int top = -1;

    public static void push(String stack[], String data) {
        if (top == N - 1) {
            System.out.println("Maaf, tumpukan penuh. PUSH " + data + " tidak dapat dilakukan.");
        } else {
            top++;
            stack[top] = data;
            System.out.println("PUSH " + data + " berhasil.");
        }
    }

    public static String pop(String stack[]) {
        String result;
        if (top < 0) {
            result = "TUMPUKAN KOSONG. POP GAGAL DILAKUKAN.";
        } else {
            result = stack[top];
            top--;
        }
        return result;
    }

    public static void displayStack(String stack[]) {
        System.out.println("\n-- TUMPUKAN --");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("-- Akhir Tumpukan --\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stack[] = new String[N];
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Tampilkan Tumpukan");
            System.out.println("0. Keluar");
            System.out.print("Pilih operasi: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan data yang akan di-push: ");
                    String dataToPush = scanner.next();
                    push(stack, dataToPush);
                    break;
                case 2:
                    String poppedData = pop(stack);
                    System.out.println("POP: " + poppedData);
                    break;
                case 3:
                    displayStack(stack);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
