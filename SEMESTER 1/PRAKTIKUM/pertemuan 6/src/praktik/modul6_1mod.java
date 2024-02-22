package praktik;

class modul6_1mod {
    public static void main(String[] args) {
        int bil;
        bil = 100;
        switch(bil%2){
            case 0:
                System.out.println("Bilangan genap");
                break;
            case 1:
                System.out.println("Bilangan ganjil");
                break;
            default :
                System.out.println("Salah bilangan");
                
        }
    }
}