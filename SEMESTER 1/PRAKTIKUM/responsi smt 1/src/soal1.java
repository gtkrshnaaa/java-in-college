import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {

        Scanner inp = new Scanner (System.in);

        int jawab;

        System.out.println("Test rekruitmen pramusaji untuk Cafe XYZ");
        System.out.println("Test pertama");
        System.out.println("Apakah anda memiliki pengalaman kerja sebelumnya?");
        System.out.println("1 jika ya");
        System.out.println("0 Jika tidak");
        System.out.print("Jawab : ");
        jawab = inp.nextInt();

        if (jawab == 1){
            System.out.println("Test selanjutnya.");
            System.out.println("Apakah anda mampu berbahasa inggris secara pasif dan pasif?");
            System.out.println("1 jika bisa berbahasa inggris dengan pasif dan aktif");
            System.out.println("0 jika hanya bisa berbahasa inggris secara pasif");
            System.out.print("Jawab : ");
            jawab = inp.nextInt();

            if (jawab == 1) {
                System.out.println("Selamat anda telah lolos test, dan diterima menjadi pramusaji di Cafe XYZ kami.");
            }
            else {
                System.out.println("Maaf kamu tidak lolos test.");
            }
        }
        else {
            System.out.println("Maaf kamu tidak lolos test.");
        }


    }
}

// Café XYZ mengadakan rekruitmen untuk mencari pramusaji. Beberapa kriteria ditetapkan oleh pihak café dan rekruitmen pun dilakukan secara bertahap. Tahap pertama tes dilakukan berdasarkan pengalaman bekerja karena café XYZ hanya mau pramusaji yang sudah mempunyai pengalaman kerja. Apabila calon pramusaji mempunyai pengalaman kerja, selanjutnya diadakan tes lagi untuk melihat kemampuan bahasa, apabila mampu berbahasa inggris secara pasif dan aktif maka diterima, tetapi jika hanya pasif saja maka tidak diterima. Buat program dengan java untuk proses rekruitmen tersebut.