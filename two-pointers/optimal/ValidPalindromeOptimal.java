
// Problem: Valid Palindrome
// Approach: Optimal (Two Pointers)
// Time Complexity: O(n) - string ek baar traverse
// Space Complexity: O(1) - koi extra space nahi


public class ValidPalindromeOptimal {

    public static boolean isPalindrome(String s) {

        // Step 1: Do pointers lo
        // Left pointer shuru se, Right pointer end se
        int left = 0;
        int right = s.length() - 1;

        // Step 2: Jab tak left pointer right se chota hai
        while (left < right) {

            // Step 3: Left pointer pe non-alphanumeric characters skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Step 4: Right pointer pe non-alphanumeric characters skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Step 5: Dono characters compare karo (case ignore)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // palindrome nahi hai
            }

            // Step 6: Dono pointers aage badho
            left++;
            right--;
        }

        // Step 7: Saare characters match ho gaye
        return true;
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