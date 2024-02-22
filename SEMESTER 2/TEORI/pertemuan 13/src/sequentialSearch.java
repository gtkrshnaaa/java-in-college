import java.util.Scanner;

public class sequentialSearch {
    public static void main(String[] args) {
        String[][] data = {
                {"135410001", "Mulyadi", "2.94"},
                {"135410005", "Willy Johan", "3.15"},
                {"135410003", "Anthony Liberty", "2.78"},
                {"135410004", "Ferry Santoso", "3.37"},
                {"135410002", "Jaya Mulya", "2.93"},
                {"135410007", "Budi Santoso", "3.01"},
                {"135410006", "Indra Gunawan", "3.56"},
                {"135410008", "M. Rudito W", "3.44"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM yang ingin dicari: ");
        String targetNim = scanner.nextLine();

        int index = sequentialSearch(data, targetNim);
        if (index != -1) {
            String nim = data[index][0];
            String nama = data[index][1];
            String ipk = data[index][2];

            System.out.println("Data ditemukan pada indeks " + index + ":");
            System.out.println("NIM   : " + nim);
            System.out.println("Nama  : " + nama);
            System.out.println("IPK   : " + ipk);
        } else {
            System.out.println("Data tidak ditemukan.");
        }
    }

    public static int sequentialSearch(String[][] data, String targetNim) {
        for (int i = 0; i < data.length; i++) {
            if (data[i][0].equals(targetNim)) {
                return i; // Mengembalikan indeks jika NIM ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika NIM tidak ditemukan
    }
}
