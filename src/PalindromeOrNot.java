public class PalindromeOrNot {
    public static void main(String[] args) {
        String maybePalindrome = "Madam, I'm Adam!";
        System.out.println(isPalindrome(maybePalindrome));
    }
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^0-9A-z]", "").toLowerCase();
        StringBuilder builder = new StringBuilder(text).reverse();
        return text.equals(builder.toString());
    }
}
