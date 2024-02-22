public class useShort {
    public static void main(String[] args) {
        short nilaiShort = 1000;

        System.out.println("Nilai short: " + nilaiShort);

        short hasilPenambahan = (short) (nilaiShort + 500);
        System.out.println("Hasil penambahan: " + hasilPenambahan);

        nilaiShort = Short.MAX_VALUE; 
        System.out.println("Nilai short sekarang: " + nilaiShort);
        nilaiShort++; 
        System.out.println("Setelah overflow: " + nilaiShort);
    }
}
