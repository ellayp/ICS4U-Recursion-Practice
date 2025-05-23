package recursion;

public class GCD {
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        if (a == b) {
            return a;
        }
        else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
    public static void main (String[] args) {
        int result = gcd(48, 18);
        System.out.println(result);
        int result2 = gcd(0, 18);
        System.out.println(result2);
        int result3 = gcd(18, 48);
        System.out.println(result3);
    }
}
