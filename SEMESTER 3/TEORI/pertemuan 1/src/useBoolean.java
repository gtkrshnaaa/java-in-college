public class useBoolean {
    public static void main(String[] args) {
        boolean benar = true;
        boolean salah = false;

        System.out.println("Nilai benar: " + benar);
        System.out.println("Nilai salah: " + salah);

        boolean hasilAnd = benar && salah;
        boolean hasilOr = benar || salah;
        boolean hasilNot = !benar; 

        System.out.println("Hasil AND: " + hasilAnd);
        System.out.println("Hasil OR: " + hasilOr);
        System.out.println("Hasil NOT dari benar: " + hasilNot);
    }
}
