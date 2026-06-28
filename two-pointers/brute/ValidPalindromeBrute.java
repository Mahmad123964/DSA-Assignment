
// Problem: Valid Palindrome
// Approach: Brute Force (Clean string, compare to reverse)
// Time Complexity: O(n) - string ek baar traverse
// Space Complexity: O(n) - cleaned string store hoti hai


public class ValidPalindromeBrute {

    public static boolean isPalindrome(String s) {

        // Step 1: String ko clean karo
        // Sirf alphanumeric characters rakho, lowercase mein convert karo
        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {

            // Step 2: Agar character alphanumeric hai
            if (Character.isLetterOrDigit(c)) {

                // Step 3: Lowercase mein add karo cleaned string mein
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Step 4: Cleaned string ko reverse karo
        String original = cleaned.toString();
        String reversed = cleaned.reverse().toString();

        // Step 5: Original aur reversed compare karo
        return original.equals(reversed);
    }

    public static void main(String[] args) {

        // Test Case 1: Palindrome hai
        System.out.println("Test 1: " + isPalindrome("A man, a plan, a canal: Panama")); // true

        // Test Case 2: Palindrome nahi hai
        System.out.println("Test 2: " + isPalindrome("race a car")); // false

        // Test Case 3: Empty string
        System.out.println("Test 3: " + isPalindrome(" ")); // true

        // Test Case 4: Single character
        System.out.println("Test 4: " + isPalindrome("a")); // true
    }
}