package praktik;

import java.util.Scanner;
class modul6_2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kode;
        System.out.print("Masukkan kode jurusan");
        kode = in.next();
        switch(kode){
            case "TI":
                System.out.println("Teknik Informatika");
                break;
            case "TK":
                System.out.println("Teknik Komputer");
                break;
            default:
                System.out.println("Salah masukkan kode jurusan");
        }
    }
}