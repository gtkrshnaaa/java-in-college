import java.util.Scanner;
public class Mod4_2_modif1{

	public static void main(String args[]){

	Scanner masuk=new Scanner(System.in);
	int B,C,D,A;

	System.out.println("Masukkan nilai B");
	B=masuk.nextInt();
	System.out.println("Masukkan nilai C");
	C=masuk.nextInt();
	System.out.println("Masukkan nilai D");
	D=masuk.nextInt();
	A=B+C*D;
	System.out.println("Hasil nilai A = "+A);

	}

}