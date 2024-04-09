//10
public class PowerOfTwo {
    public static void main(String[] args) {
        for (int i = 0; i <= 32; i++) {
            System.out.println(i + " is " + (isPowerOfTwo(i) ? "" : "not ") + "a power of two");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
