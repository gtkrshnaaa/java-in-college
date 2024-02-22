class Mahasiswa {
    private String Nama;
    private String No_Mhs;
    private String Jen_Kel;
    private String No_Hp;
    
    public Mahasiswa(String Nama, String No_Mhs, String Jen_Kel, String No_Hp) {
        this.Nama = Nama;
        this.No_Mhs = No_Mhs;
        this.Jen_Kel = Jen_Kel;
        this.No_Hp = No_Hp;
    }
    
    public void display() {
        System.out.println("Biodata Mahasiswa:");
        System.out.println("Nama: " + Nama);
        System.out.println("No Mahasiswa: " + No_Mhs);
        System.out.println("Jenis Kelamin: " + Jen_Kel);
        System.out.println("No HP: " + No_Hp);
    }
    
    // Overloading display() method
    public void display(String alamat) {
        display();
        System.out.println("Alamat: " + alamat);
    }
    
    // Overriding toString() method
    @Override
    public String toString() {
        return "Biodata Mahasiswa:\n" +
                "Nama: " + Nama + "\n" +
                "No Mahasiswa: " + No_Mhs + "\n" +
                "Jenis Kelamin: " + Jen_Kel + "\n" +
                "No HP: " + No_Hp;
    }
}

public class soal2 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ari", "123456", "Laki-laki", "081234567890");
        mahasiswa1.display();
        System.out.println();
        
        Mahasiswa mahasiswa2 = new Mahasiswa("Angga", "654321", "Laki-laki", "089876543210");
        mahasiswa2.display("Jl. Antartika, Kota Bumi");
        System.out.println();
        
        System.out.println(mahasiswa1);
    }
}
