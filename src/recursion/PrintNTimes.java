package recursion;

public class PrintNTimes {
    public static void printNTimes(String word, int n) {
        if (n == 0) {
            return;
        }
        System.out.println(word);
        printNTimes(word, n - 1);
    }

    public static void main(String[] args) {
        printNTimes("hi", 3);
    }
}
