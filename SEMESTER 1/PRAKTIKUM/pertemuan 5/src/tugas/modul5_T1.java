import java.util.Scanner;
public class modul5_T1 {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
System.out.println("Menentukan bilangan terbesar dan terkecil dari 3 buah bilangan.");

int bilA,bilB,bilC;
System.out.print("Masukkan bilangan pertama:");
bilA=input.nextInt();
System.out.print("Masukkan bilangan kedua:");
bilB=input.nextInt();
System.out.print("Masukkan bilangan ketiga:");
bilC=input.nextInt();
        {
if(bilA>bilB && bilA>bilC && bilB>bilC)
{
System.out.println("Bilangan terbesar:"+bilA);
System.out.println("Bilangan terkecil:"+bilB);
            }

else if(bilA>bilB && bilA>bilC && bilB>bilC)
{
    System.out.println("Bilangan terbesar:"+bilA);
System.out.println("Bilangan terkecil:"+bilC);
}
 else if(bilB>bilA && bilB>bilC && bilB>bilA   )
{
     System.out.println("Bilangan terbesar:"+bilB);
System.out.println("Bilangan terkecil:"+bilA);
}
else if ( bilB>bilA && bilB>bilC && bilA>bilC)
    {
     System.out.println("Bilangan terbesar:"+bilB);
System.out.println("Bilangan terkecil:"+bilC);
}
 else if (bilC>bilA && bilC>bilB && bilB>bilA)
{
System.out.println("Bilangan terbesar:"+bilC);
System.out.println("Bilangan terkecil:"+bilA);
    }
 else if (bilC>bilA && bilC>bilB && bilA>bilB)
{
     System.out.println("Bilangan terbesar:"+bilC);
System.out.println("Bilangan terkecil:"+bilB);
 }
        }

    }
}