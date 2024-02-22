import java.util.Scanner;
public class Mod4_3 {
	public static void main(String args[]) {

		Scanner masuk=new Scanner(System.in);
		int Bil1, Bil2, Hasil;
		System.out.print("Masukkan Bil 1 = ");
		Bil1=masuk.nextInt();
		System.out.print("Masukkan Bil 2 = ");
		Bil2=masuk.nextInt();
		Hasil=Bil1%Bil2;
		System.out.println("Hasil = "+Hasil);
		}

	}