public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            if (start != last) {
                return false;
            }
        }
        return true;
    }
}
