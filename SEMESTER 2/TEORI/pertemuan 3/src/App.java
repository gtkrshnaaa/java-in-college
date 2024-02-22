public class App {
    public static void main(String[] args) throws Exception {

        int[][][] threeDArray = new int[3][4][5];

        // Inisialisasi nilai untuk setiap elemen dalam array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeDArray[i][j][k] = i + j + k;
                }
            }
        }

        // Cetak nilai dari setiap elemen dalam array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(threeDArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

