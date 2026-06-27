
// Problem: Is Subsequence
// Approach: Optimal (Two Pointers)
// Time Complexity: O(n+m) - dono strings ek baar traverse
// Space Complexity: O(1) - koi extra space nahi


public class IsSubsequenceOptimal {

    public static boolean isSubsequence(String s, String t) {

        // Step 1: Dono strings ke liye alag alag pointers lo
        int sPointer = 0; // s ka pointer
        int tPointer = 0; // t ka pointer

        // Step 2: Jab tak dono pointers apni strings ke andar hain
        while (sPointer < s.length() && tPointer < t.length()) {

            // Step 3: Agar dono characters match karte hain
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++; // s ka next character dhundo
            }

            // Step 4: t ka pointer hamesha aage rahay ga 
            tPointer++;
        }

        // Step 5: Agar s ke saare characters mil gaye
        // sPointer == s.length() matlab poora s match ho gaya
        return sPointer == s.length();
    }

    public static void main(String[] args) {

        // Test Case 1: Subsequence hai
        System.out.println("Test 1: " + isSubsequence("ace", "abcde")); // true

        // Test Case 2: Subsequence nahi hai
        System.out.println("Test 2: " + isSubsequence("aec", "abcde")); // false

        // Test Case 3: Empty string
        System.out.println("Test 3: " + isSubsequence("", "abcde")); // true

        // Test Case 4: s, t se bada hai
        System.out.println("Test 4: " + isSubsequence("abcde", "ace")); // false
    }
}