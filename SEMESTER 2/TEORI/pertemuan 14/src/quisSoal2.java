// Buatlah program untuk menghasilkan keluaran sebagai berikut : 

// Perulangan [x=0, y=0]
// Perulangan [x=0, y=1]
// Perulangan [x=0, y=2]
// Perulangan [x=1, y=0]
// Perulangan [x=1, y=1]
// Perulangan [x=1, y=2]
// Perulangan [x=2, y=0]
// Perulangan [x=2, y=1]
// Perulangan [x=2, y=2]
// Perulangan [x=3, y=0]
// Perulangan [x=3, y=1]
// Perulangan [x=3, y=2]
// Press any key to continue . . .




// public class quisSoal2 {
//     public static void main(String[] args) {
//         for (int x = 0; x <= 3; x++) {
//             for (int y = 0; y <= 2; y++) {
//                 System.out.println("Perulangan [x=" + x + ", y=" + y + "]");
//             }
//         }
//     }
// }

public class quisSoal2 {
    public static void main(String[] args) {
        perulangan();
    }
    
    public static void perulangan() {
        for (int x = 0; x <= 3; x++) {
            for (int y = 0; y <= 2; y++) {
                System.out.println("Perulangan [x=" + x + ", y=" + y + "]");
            }
        }
    }
}
