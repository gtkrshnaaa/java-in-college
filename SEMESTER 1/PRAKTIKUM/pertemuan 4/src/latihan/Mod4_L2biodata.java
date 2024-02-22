package latihan;

import java.util.Scanner;
public class Mod4_L2biodata{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	String NIM,nama,tempatLahir,tanggalLahir,usia,noHp,email,jurusan,alamat;
	System.out.println("Masukkan NIM");
	NIM=input.nextLine();
	System.out.println("Masukkan Nama");
	nama=input.nextLine();
	System.out.println("Masukkan Tempat Lahir");
	tempatLahir=input.nextLine();
	System.out.println("Masukkan Tanggal Lahir");
	tanggalLahir=input.nextLine();
	System.out.println("Masukkan Usia");
	usia=input.nextLine();
	System.out.println("Masukkan Nomor HP");
	noHp=input.nextLine();
	System.out.println("Masukkan E-Mail");
	email=input.nextLine();
	System.out.println("Masukkan Jurusan");
	jurusan=input.nextLine();
	System.out.println("Masukkan Alamat");
	alamat=input.nextLine();
	System.out.println();
	System.out.println();
	System.out.println("NIM = "+NIM);
	System.out.println("Nama = "+nama);
	System.out.println("Tempat Lahir = "+tempatLahir);
	System.out.println("Tanggal Lahir = "+tanggalLahir);
	System.out.println("Usia = "+usia);
	System.out.println("Nomor HP = "+noHp);
	System.out.println("E-Mail = "+email);
	System.out.println("Jurusan = "+jurusan);
	System.out.println("Alamat = "+alamat);

	}
}