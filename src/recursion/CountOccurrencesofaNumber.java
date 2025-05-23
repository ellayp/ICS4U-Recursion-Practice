package recursion;

public class CountOccurrencesofaNumber {
    public static int countOccurrences(int[] arr, int n, int target) {
        if (n == 0) {
            return 0;
        }

        int count = countOccurrences(arr, n - 1, target);
        if (arr[n - 1] == target) {
            count++;
        }
        return count;
        
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 2};
        int result = countOccurrences(arr, arr.length, 2);
        System.out.println(result);
    }
    
}
