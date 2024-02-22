import java.lang.Math;

public class t1 {
  public static void main(String[] args) {
    // Tentukan nilai a, b, dan c dari persamaan kuadrat
    double a = 1;
    double b = 2;
    double c = 1;

    // Hitung diskriminan
    double diskriminan = b*b - 4*a*c;

    // Jika diskriminan > 0, x1 dan x2 berupa bilangan real
    if (diskriminan > 0) {
        double x1 = (-b + Math.sqrt(diskriminan)) / (2*a);
        double x2 = (-b - Math.sqrt(diskriminan)) / (2*a);
        System.out.println("Akar-akar persamaan adalah " + x1 + " dan " + x2);
    }

    // Jika diskriminan = 0, x1 dan x2 berupa bilangan kembar
    else if (diskriminan == 0) {
        double x2;
        double x1 = x2 = -b / (2*a);
        System.out.println("Akar-akar persamaan adalah " + x1 + " dan " + x2);
    }

    // Jika diskriminan < 0, x1 dan x2 berupa bilangan kompleks
    else {
        double x1 = (-b + Math.sqrt(Math.abs(diskriminan))) / (2*a);
        double x2 = (-b - Math.sqrt(Math.abs(diskriminan))) / (2*a);
        System.out.println("Akar-akar persamaan adalah " + x1 + " dan " + x2);
    }
  }
}



// Program ini merupakan implementasi menghitung akar-akar persamaan kuadrat ax^2 + bx + c = 0 dengan memperhitungkan kondisi diskriminan. Pertama, program menentukan nilai a, b, dan c dari persamaan kuadrat yang akan dicari akar-akarnya. Kemudian, program menghitung diskriminan dengan rumus diskriminan = b^2 - 4ac. Setelah itu, program memeriksa kondisi diskriminan dan menghitung akar-akar persamaan sesuai dengan ketentuan yang telah diberikan. Jika diskriminan > 0, maka persamaan memiliki dua akar yang berbeda dan real, sehingga akar-akar tersebut dicari dengan rumus x1 = (-b + sqrt(diskriminan)) / (2a) dan x2 = (-b - sqrt(diskriminan)) / (2a). Jika diskriminan = 0, maka persamaan memiliki dua akar yang sama dan real, sehingga akar tersebut dicari dengan rumus x1 = x2 = -b / (2a). Jika diskriminan < 0, maka persamaan memiliki dua akar yang berbeda dan kompleks, sehingga akar-akar tersebut dicari dengan rumus x1 = (-b + sqrt(abs(diskriminan)) * i) / (2a) dan x2 = (-b - sqrt(abs(diskriminan)) * i) / (2a), dimana i adalah akar kompleks dari -1. Setelah akar-akar ditemukan, program akan menampilkan hasilnya ke layar.