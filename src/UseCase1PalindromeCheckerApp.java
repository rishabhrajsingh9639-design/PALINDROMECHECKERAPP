
public class UseCase1PalindromeCheckerApp {

    // Application version constant
    private static final String APP_VERSION = "1.0";


    public static void main(String[] args) {

        public class UseCase2PalindromeCheckerApp {

            public static void main(String[] args) {

                // Hardcoded string
                String word = "madam";
                boolean isPalindrome = true;

                int n = word.length();

                // Check characters till n/2
                for (int i = 0; i < n / 2; i++) {
                    if (word.charAt(i) != word.charAt(n - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }


                if (isPalindrome) {
                    System.out.println(word + " is a Palindrome.");
                } else {
                    System.out.println(word + " is not a Palindrome.");
                }
            }
        }
    }
}