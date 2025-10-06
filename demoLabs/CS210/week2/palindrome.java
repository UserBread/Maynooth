public class palindrome
{
    public static void main(String[] args) {
        String str = "apple";

        if (isPalindrome(str)) {

            System.out.println(str + " is a palindrome");
        }
        else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {

        int start = 0, end = word.length() - 1;
        while (start <= end) {

            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}