import java.util.Scanner;

public class p4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double total = 0;
    double average;
    int count = 0;

    System.out.print("Masukan banyak data yang ingin dihitung : ");
    int numData = input.nextInt();

    while (count < numData) {
      System.out.print("Masukkan angka : ");
      int number = input.nextInt();

      total += number;
      count++;
    }

    average = total / numData;
    System.out.println("Rata-rata dari " + numData + " data tersebut adalah " + average);
  }
}

