package recursion;

public class CountDownTimer {
    public static void countDown(int n) {
        // solution here
        if (n == 1) {
            System.out.print(n);
            return;
        }
        else {
            System.out.println(n);
            countDown(n - 1);
        }
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}