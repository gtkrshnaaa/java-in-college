public class useByte {
    public static void main(String[] args) {
        byte nilaiPertama = 50;
        byte nilaiKedua = -30;

        System.out.println("Nilai Pertama: " + nilaiPertama);
        System.out.println("Nilai Kedua: " + nilaiKedua);

        byte hasilPenjumlahan = (byte) (nilaiPertama + nilaiKedua); 
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);

        byte hasilPerkalian = (byte) (nilaiPertama * nilaiKedua); 
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
}
