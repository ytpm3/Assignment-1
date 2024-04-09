//4
public class SumOfPowers {
    public static void main(String[] args) {
        int b = 4; // Base
        int n = 3; // Number of powers
        int result = sumOfPowers(b, n);
        System.out.println("Sum of the first " + n + " powers of base " + b + ": " + result);
    }

    public static int sumOfPowers(int b, int n) {
        // Base case: if n is 0, return 1 (b^0 = 1)
        if (n == 0) {
            return 1;
        }
        // Recursive case: return b^n plus the sum of the first n-1 powers of b
        return (int)Math.pow(b, n) + sumOfPowers(b, n - 1);
    }
}