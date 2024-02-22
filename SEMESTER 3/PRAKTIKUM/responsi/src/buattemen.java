public class buattemen {
    public static int customMaxSize = 4;
    public static int customTopIndex = -1;

    public static void pushElement(String customStack[], String data) {
        if (customTopIndex == customMaxSize - 1) {
            System.out.println("Tumpukan penuh, PUSH " + data + " tidak dapat dilakukan.");
        } else {
            customTopIndex++;
            customStack[customTopIndex] = "Buku " + data;
            System.out.println("PUSH " + data);
        }
    }

    public static String popByValue(String customStack[], String data) {
        String result = "Data tidak ditemukan. POP GAGAL DILAKUKAN.";
        int index = -1;

        for (int i = 0; i <= customTopIndex; i++) {
            if (customStack[i].equals("Buku " + data)) {
                index = i;
                result = customStack[i];
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < customTopIndex; i++) {
                customStack[i] = customStack[i + 1];
            }
            customTopIndex--;
        }

        return result;
    }

    public static void displayCustomStack(String customStack[]) {
        System.out.println("-- STACK AWAL--");
        for (int i = customTopIndex; i >= 0; i--) {
            System.out.println(customStack[i]);
        }
        System.out.println("--STACK AKHIR--\n");
    }

    public static void main(String[] args) {
        String customStack[] = new String[customMaxSize];

        pushElement(customStack, "I");
        pushElement(customStack, "D");
        pushElement(customStack, "T");
        pushElement(customStack, "U");
        pushElement(customStack, "O"); 

        System.out.println("");
   
        displayCustomStack(customStack);

        System.out.println("");

        String poppedData1 = popByValue(customStack, "T");
        String poppedData2 = popByValue(customStack, "D");
       

        System.out.println("POP: " + poppedData1);
        System.out.println("POP: " + poppedData2);

        System.out.println("");

        displayCustomStack(customStack);
    }
}
