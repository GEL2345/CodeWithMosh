import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
        System.out.print("Name: ");
//        String name = scanner.next();
        String name = scanner.nextLine();
        System.out.println("You are " + name);
    }
}