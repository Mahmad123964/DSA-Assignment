// Problem: Reverse String
// Approach: Brute Force (Extra Array)
// Time Complexity: O(n) - ek baar array traverse
// Space Complexity: O(n) - extra array use ho raha hai


public class ReverseStringBrute {

    public static void reverseString(char[] s) {

        // Step 1: Ek naya array banao same size ka
        char[] temp = new char[s.length];

        // Step 2: Original array ko ulta temp mein copy karo
        for (int i = 0; i < s.length; i++) {

            // Step 3: Last element pehle, pehla element last
            temp[i] = s[s.length - 1 - i];
        }

        // Step 4: Temp array ko wapas original mein copy karo
        for (int i = 0; i < s.length; i++) {
            s[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println("Test 1: " + new String(s1)); // olleh

        // Test Case 2
        char[] s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s2);
        System.out.println("Test 2: " + new String(s2)); // hannaH

        // Test Case 3: Single element
        char[] s3 = {'a'};
        reverseString(s3);
        System.out.println("Test 3: " + new String(s3)); // a
    }
}