public class p2_fungsi2{
    public static int jumlah(int a){
        return (a + a);
    }
    public static void main (String args[]){
        System.out.println("Panggil method jumlah dengan parameter 5");
        System.out.println(jumlah(5));
        System.out.println("Panggil method jumlah dengan parameter 15");
        System.out.println(jumlah(15));
    }
}