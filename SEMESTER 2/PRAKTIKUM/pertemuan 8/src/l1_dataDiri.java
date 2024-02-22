public class l1_dataDiri {
    String nik = "1234567890",
           nama = "Gilang Teja Krishna",
           jenisKelamin = "Laki-laki",
           alamat = "Yogyakarta";
    int umur = 19;

    public void tampilDataDiri() {
        System.out.println("NIK           : " + nik);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur          : " + umur);
        System.out.println("Alamat        : " + alamat);
    }

    public static void main(String[] args) {
        l1_dataDiri data = new l1_dataDiri();
        data.tampilDataDiri();
    }
}
