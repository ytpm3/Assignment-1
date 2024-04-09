//8
import java.util.Scanner;

public class Sequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        generateSequences(n, k, new int[n], 0);

        scanner.close();
    }

    public static void generateSequences(int n, int k, int[] sequence, int index) {
        if (index == n) {
            printSequence(sequence);
            return;
        }

        for (int i = 1; i <= k; i++) {
            sequence[index] = i;
            generateSequences(n, k, sequence, index + 1);
        }
    }

    public static void printSequence(int[] sequence) {
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


