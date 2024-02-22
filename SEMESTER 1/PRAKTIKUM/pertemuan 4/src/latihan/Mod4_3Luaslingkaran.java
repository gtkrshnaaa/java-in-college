package latihan;

import java.util.Scanner;
public class Mod4_3Luaslingkaran{

	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int r;
		double luas, phi=3.14;
		System.out.println("Masukkan jari jari = ");
		r=input.nextInt();
		luas=phi*r*r;
		System.out.println("Luas lingkaran adalah "+luas);

		}

}
