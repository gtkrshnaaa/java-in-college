public class useLong {
    public static void main(String[] args) {
        long saldoBank = 1000000000L;

        System.out.println("Saldo di bank Anda adalah: " + saldoBank);

        long pengeluaranBulanIni = 5000000L;
        saldoBank -= pengeluaranBulanIni;

        System.out.println("Setelah pengeluaran bulan ini, saldo Anda adalah: " + saldoBank);
    }
}
