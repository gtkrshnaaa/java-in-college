class modp3Mahasiswa {
    String nim;
    String nama;
    String prodi;
    double ipk;

    public void setMhs(String nim, String nama, String prodi, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi: " + prodi);
        System.out.println("IPK: " + ipk);
    }

    public static void main(String[] args) {
        modp3Mahasiswa mhs = new modp3Mahasiswa();
        mhs.setMhs("145410012", "Nisa", "Informatika", 3.75);
        mhs.tampil();
    }
}

// Program ini akan menampilkan informasi mahasiswa seperti NIM, nama, program studi, dan IPK setelah dimodifikasi. Dalam contoh ini, IPK diinisialisasi dengan nilai 3.75. Anda dapat mengubah nilai IPK saat memanggil metode setMhs() pada objek mhs.