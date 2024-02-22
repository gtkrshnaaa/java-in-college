public class quis2 {
    public static void main (String[] args) {
        String[] nama = {"Dadan", "Didin", "Deden", "Maman", "Mimin", "Mumun"};
        int[] nilai = {40, 50, 60, 70, 80, 90};
        String[] index = {"E", "D", "C", "B", "A", "A" };

        System.out.println("======================================");
        System.out.println("Nama\t\tNilai\t\tIndex");
        System.out.println("======================================");
        // menampilkan array
        for (int i = 0; i < nama.length; i++)
        System.out.println(nama[i] + "\t\t " + nilai[i] + "\t\t " + index[i]);
    }
}
