import java.util.Scanner;
public class pert6_lat1switch{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);

		System.out.println("Pilih 1 untuk penjumlahan 2 bilangan");
		System.out.println("Pilih 2 untuk pengurangan 2 bilangan");
		System.out.println("Pilih 3 untuk perkalian 2 bilangan");
		System.out.println("------------------------------");
			int pilihan, bil1, bil2, hasil;
			System.out.print("Masukkan pilihan anda (1, 2, 3) = ");
			pilihan=input.nextInt();
			switch (pilihan){
				case 1: System.out.print("Masukkan bilangan 1 = ");
						bil1=input.nextInt();
						System.out.print("Masukkan bilangan 2 = ");
						bil2=input.nextInt();
						hasil=bil1+bil2;
						System.out.println("Hasil ="+hasil);
						break;

				case 2: System.out.print("Masukkan bilangan 1 = ");
						bil1=input.nextInt();
						System.out.print("Masukkan bilangan 2 = ");
						bil2=input.nextInt();
						hasil=bil1-bil2;
						System.out.println("Hasil ="+hasil);
						break;

				case 3: System.out.print("Masukkan bilangan 1 = ");
						bil1=input.nextInt();
						System.out.print("Masukkan bilangan 2 = ");
						bil2=input.nextInt();
						hasil=bil1*bil2;
						System.out.println("Hasil = "+hasil);
						break;

				default: System.out.println("Salah masukkan pilihan");

				}


	}
}