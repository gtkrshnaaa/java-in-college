import java.util.Scanner;
public class l1_stringPassword {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);
        System.out.print("Masukan password : ");
        String password = inp.nextLine();
        String corectpw = "AKAKOM";
        if (password.equals(corectpw)) {
            System.out.println("password anda benar");
        }
        else {
            System.out.println("password anda salah");
        }
    }
}
