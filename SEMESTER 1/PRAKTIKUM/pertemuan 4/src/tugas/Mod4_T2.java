import java.util.Scanner;
public class Mod4_T2{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	float c,r,f;

	System.out.println("Masukkan Celcius");
	c=input.nextInt();
	r=(float)(0.8*c);
	f=(float)(1.8*c+32);
	System.out.println("Celcius --> Reamur = "+r);
	System.out.println("Celcius --> Fahrenheit = "+f);

	}
}
