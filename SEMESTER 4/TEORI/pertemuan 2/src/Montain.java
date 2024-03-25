public class Montain {
    private String name;
    private double height;

    public Montain(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }
    public void displayInfo() {
        System.out.println("Mountain Name: " + name);
        System.out.println("Height: " + height + " meters");
    }
    // Fungsi overload untuk menghitung luas segitiga
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }
    // Fungsi overload untuk menghitung luas persegi
    public static double calculateArea(double side) {
        return side * side;
    }
    // Fungsi overload untuk menghitung volume balok
    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }
    public static void main(String[] args) {
        Montain mountain1 = new Montain("Everest", 8848);
        mountain1.displayInfo();
        Montain mountain2 = new Montain("K2", 8611);
        mountain2.displayInfo();
        // Menggunakan fungsi overload langsung dari kelas Mountain
        System.out.println("Area of Triangle: " + Montain.calculateArea(5, 3));
        System.out.println("Area of Square: " + Montain.calculateArea(4));
        System.out.println("Volume of Box: " + Montain.calculateVolume(2, 3, 4));
    }
}
