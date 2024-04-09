//5
import java.util.Scanner;

public class ReverseSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the sequence:");
        printReversedSequence(scanner, n);

        scanner.close();
    }

    public static void printReversedSequence(Scanner scanner, int n) {
        if (n <= 0) {
            return;
        }

        int num = scanner.nextInt();
        printReversedSequence(scanner, n - 1);
        System.out.print(num + " ");
    }
}
