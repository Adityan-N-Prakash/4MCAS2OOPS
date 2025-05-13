import java.util.Scanner;

public class OddEvenSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number or a single character: ");
        String input = sc.next();

        char ch = input.charAt(0);
        if ("aeiouAEIOU".indexOf(ch) != -1) {
            System.out.println("Vowel detected. Exiting.");
        } else {
            try {
                int num = Integer.parseInt(input);
                if (num % 2 == 0)
                    System.out.println("Even number.");
                else
                    System.out.println("Odd number.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }

        sc.close();
    }
}

