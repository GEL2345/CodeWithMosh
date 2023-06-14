import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        // Input - 5 = Fizz, 3 = Buzz, 3 and 5 = FizzBuzz
        if (x % 3 == 0 && x % 5 == 0)
            System.out.println("FizzBuzz");
        else if (x % 5 == 0) {
            System.out.println("Fizz");}
        else if (x % 3 == 0) {
            System.out.println("Buzz");
        }
        else
            System.out.println(x);

    }


    }