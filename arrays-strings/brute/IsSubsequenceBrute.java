
// Problem: Is Subsequence
// Approach: Brute Force
// Time Complexity: O(n*m) - nested loops
// Space Complexity: O(1)


public class IsSubsequenceBrute {

    public static boolean isSubsequence(String s, String t) {

        // Step 1: s aur t ki lengths lo
        int sLen = s.length();
        int tLen = t.length();

        // Step 2: Agar s empty hai to hamesha true hai
        if (sLen == 0) return true;

        // Step 3: s ka pehla character dhundho t mein
        int sIndex = 0; // s ka pointer

        // Step 4: t ke har character ko check karo
        for (int i = 0; i < tLen; i++) {

            // Step 5: Agar current character match karta hai
            if (t.charAt(i) == s.charAt(sIndex)) {

                // Step 6: s ka next character dhundho
                sIndex++;

                // Step 7: Agar saare characters mil gaye
                if (sIndex == sLen) {
                    return true; // subsequence hai!
                }
            }
        }

        // Step 8: Saare characters nahi mile
        return false;
    }

    public static void main(String[] args) {

        // Test Case 1: Subsequence hai
        System.out.println("Test 1: " + isSubsequence("ace", "abcde")); // true

        // Test Case 2: Subsequence nahi hai
        System.out.println("Test 2: " + isSubsequence("aec", "abcde")); // false

        // Test Case 3: Empty string
        System.out.println("Test 3: " + isSubsequence("", "abcde")); // true

        // Test Case 4: s t se bada hai
        System.out.println("Test 4: " + isSubsequence("abcde", "ace")); // false
    }
}