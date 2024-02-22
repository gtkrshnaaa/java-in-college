import java.util.Scanner;
public class Mod4_T1{

	public static void main(String args[]){
	Scanner input=new Scanner(System.in);

	int gajiPokok;
	float tjnKinerja, tjnLain, ttlGaji;
	System.out.println("Masukkan Gaji Pokok");
	gajiPokok=input.nextInt();
	tjnKinerja=(float)(0.2*gajiPokok);
	tjnLain=(float)(0.1*tjnKinerja);
	ttlGaji=gajiPokok+tjnKinerja+tjnLain;
	System.out.println("Gaji Pokok = "+gajiPokok);
	System.out.println("Tunjangan Kinerja = "+tjnKinerja);
	System.out.println("Tunjangan Lain = "+tjnLain);
	System.out.println("Total Gaji = "+ttlGaji);

	}
}
