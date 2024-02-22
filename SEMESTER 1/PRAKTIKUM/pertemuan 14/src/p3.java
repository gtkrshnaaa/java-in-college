import java.util.Scanner;

public class p3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double total = 0;
    double average;
    int count = 0;

    while (count < 5) {
      System.out.print("Masukkan angka: ");
      int number = input.nextInt();

      total += number;
      count++;
    }

    average = total / 5;
    System.out.println("Rata-rata dari 5 data tersebut adalah " + average);
  }
}

