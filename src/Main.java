import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "";
        Scanner scanner = new Scanner(System.in);

        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (!input.equals("quit")) // Style 1
                System.out.println(input);
            if (input.equals("pass"))
                continue;
            if (input.equals("quit")) // Style 2
                break;
            System.out.println(input);
        }
    }
}