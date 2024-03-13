class Buku {
    String judul;
    int harga;
    int halaman;

    public void setBuku(String judul, int harga, int halaman) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judulbuku :" + judul);
        System.out.println("Harga buku: " + harga);
        System.out.println("Jumlah halaman : " + halaman);
    }
}
