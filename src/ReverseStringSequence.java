//6
import java.util.Scanner;

public class ReverseStringSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();

        System.out.println("Enter the strings:");
        printReversedStringSequence(scanner, n);

        scanner.close();
    }

    public static void printReversedStringSequence(Scanner scanner, int n) {
        if (n <= 0) {
            return;
        }

        char[] strArray = scanner.next().toCharArray();
        printReversedStringSequence(scanner, n - 1);
        System.out.println(new String(strArray));
    }
}

