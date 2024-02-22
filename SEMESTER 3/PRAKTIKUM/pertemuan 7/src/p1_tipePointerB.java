import java.util.Scanner; 
class tipePointerB { 
    int angka; 
    String teks; 
} 
 
class belajarPointerP1B { 
    public static void main(String[] args) { 
        tipePointerB P; 
        P = null; 
        if (P == null) 
                System.out.println("Pointer P menunjuk ke Null"); 
        else 
                System.out.println("Pointer P mengarah ke tempat lain"); 
    } 
} 