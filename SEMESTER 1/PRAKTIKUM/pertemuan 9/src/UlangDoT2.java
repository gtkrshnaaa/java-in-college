import java.util.Scanner;
   
public class UlangDoT2 {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
      
    int n,i=1;
     
    System.out.print("Masukan n: ");
    n = input.nextInt();
    System.out.println();

    do {
        System.out.println(i*i + " ");
      i++;
    }
  
    while (i<=n);
      
    
  }
}

