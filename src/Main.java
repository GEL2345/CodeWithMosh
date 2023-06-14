import java.security.Principal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Principal = Amount being loaned to you - Deposit + Principal = Total Amount
//        Annual Interest Rate (R) , Duration (Years)
//        Mortgage = P x by (R(1 + R)N (Power of N)) / ((1 + R)N (Power of N) - 1)

//        Ask for Principal (P)
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much are you wishing to borrow?: ");
        long principal = scanner.nextLong();
//        Ask Annual Interest Rate (R)
        System.out.print("What is the annual interest rate?: ");
        float interest = scanner.nextFloat();
//        Ask for Duration (N * 12 is how many months)
        System.out.print("How many years will the mortgage be for?: ");
        int duration = scanner.nextInt();
        int duration * 12;

//        Math.pow();
//        P x by (R(1 + R)N (Power of N)) / ((1 + R)N (Power of N) - 1)
//        Math.pow()
//        Calculate

    }
}