class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    public void setMhs(String nim,String nama,String prodi) {
        this.nim=nim;
        this.nama=nama;
        this.prodi=prodi;
    }

    public void tampil() {
        System.out.println("Judulbuku :"+nim);
        System.out.println("Harga buku : "+nama);
        System.out.println("Jumlah halaman : "+prodi);
    }
    
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setMhs("145410012","Nisa","Informatika");
        mhs.tampil();
    }
}