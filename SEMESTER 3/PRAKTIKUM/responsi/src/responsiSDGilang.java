public class responsiSDGilang {
    public static int N = 4;
    public static int top = -1;

    public static void push(String stack[], String data) {
        if (top == N - 1) {
            System.out.println("Tumpukan penuh, PUSH " + data + " tidak dapat dilakukan.");
        } else {
            top++;
            stack[top] = "Buku " + data;
            System.out.println("PUSH " + data);
        }
    }

    public static String popByValue(String stack[], String data) {
        String result = "Data tidak ditemukan. POP GAGAL DILAKUKAN.";
        int index = -1;

        for (int i = 0; i <= top; i++) {
            if (stack[i].equals("Buku " + data)) {
                index = i;
                result = stack[i];
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < top; i++) {
                stack[i] = stack[i + 1];
            }
            top--;
        }

        return result;
    }

    public static void displayStack(String stack[]) {
        System.out.println("-- STACK AWAL--");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        System.out.println("--STACK AKHIR--\n");
    }

    public static void main(String[] args) {
        String stack[] = new String[N];


        push(stack, "I");
        push(stack, "D");
        push(stack, "T");
        push(stack, "U");
        push(stack, "O"); 

        System.out.println("");
   
        displayStack(stack);

        System.out.println("");

        String poppedData1 = popByValue(stack, "T");
        String poppedData2 = popByValue(stack, "D");
       

        System.out.println("POP: " + poppedData1);
        System.out.println("POP: " + poppedData2);

        System.out.println("");

        displayStack(stack);
    }
}
