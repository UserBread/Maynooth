public class palindrome
{
    public static void main(String [] args) {

        String word = "racecar";

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } 
        else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String str) {

        if (str == null) {
            return false;
        }
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}