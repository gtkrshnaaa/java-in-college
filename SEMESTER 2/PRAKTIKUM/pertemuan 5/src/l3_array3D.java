public class l3_array3D {

    public static void main(String[] args) {

        int arr[][][] = {
                {{0,0,0}, {0,0,1}},
                {{0,1,0}, {0,1,1}},
                {{1,0,0}, {1,0,1}},
                {{1,1,0}, {1,1,1}}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]);
                    if (k < arr[i][j].length - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }
    }
}
