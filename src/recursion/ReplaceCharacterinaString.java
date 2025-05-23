package recursion;

public class ReplaceCharacterinaString {
    public static String replaceChar(String s, char target, char replacement) {
        if (s.length() == 0) {
            return "";
        }

        char firstChar = 0;
        if (s.charAt(0) == target) {
            firstChar = replacement;
        } else {
            firstChar += s.charAt(0);
        }
        return firstChar + replaceChar(s.substring(1), target, replacement);
    }
    public static void main(String args[]) {
        String result = replaceChar("banana", 'a', 'o');
        System.out.println(result);
        String blank = replaceChar("", 'a', 'a');
        System.out.println(blank);
    }
}
