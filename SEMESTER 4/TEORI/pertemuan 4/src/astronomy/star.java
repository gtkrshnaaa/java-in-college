package astronomy;

public class star {
    private String name;
    private double magnitude;
    private double distance; // dalam tahun cahaya

    public star(String name, double magnitude, double distance) {
        this.name = name;
        this.magnitude = magnitude;
        this.distance = distance;
    }

    // getter untuk mendapatkan nama bintang
    public String getName() {
        return name;
    }

    // getter untuk mendapatkan magnitudo bintang
    public double getMagnitude() {
        return magnitude;
    }

    // getter untuk mendapatkan jarak bintang
    public double getDistance() {
        return distance;
    }

    // metode untuk menampilkan informasi tentang bintang
    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Magnitudo: " + magnitude);
        System.out.println("Jarak: " + distance + " tahun cahaya");
    }
}
