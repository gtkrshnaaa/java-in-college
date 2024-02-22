import java.util.Scanner;
class modul5_L1{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			float ipk;
			System.out.println("Masukkan IPK");
			ipk = input.nextFloat();
			System.out.println("IPK = "+ipk);
			if (ipk >= 2.75 && ipk <= 2.99){
				System.out.println("Memuaskan");
				}
				else if (ipk >= 3.00 && ipk <= 3.50){
					System.out.println("Sangat Memuaskan");
					}
					else if (ipk >= 3.51 && ipk <= 4.00){
						System.out.println("Dengan pujian");
						}
						else {
							System.out.println("Input salah");
							}
			}

	}