//9
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.next();

        generatePermutations(str.toCharArray(), 0);

        scanner.close();
    }

    public static void generatePermutations(char[] str, int index) {
        if (index == str.length) {
            System.out.println(new String(str));
            return;
        }

        for (int i = index; i < str.length; i++) {
            swap(str, index, i);
            generatePermutations(str, index + 1);
            swap(str, index, i);
        }
    }

    public static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
