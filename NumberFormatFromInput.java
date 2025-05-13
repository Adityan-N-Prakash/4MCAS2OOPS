import java.util.Scanner;

public class NumberFormatFromInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.next();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Valid number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Not a number.");
        }

        sc.close();
    }
}

