public class p5_method5{
    public int jumlah(){
        int a = 8, b = 10;
        return (a + b);
    }
    public static void main(String args[]){
        p5_method5 obyek = new p5_method5();
        System.out.println("Hasil pemanggilan method jumlah");
        System.out.println(obyek.jumlah());
    }
}