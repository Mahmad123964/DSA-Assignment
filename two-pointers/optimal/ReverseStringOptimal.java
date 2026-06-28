
// Problem: Reverse String
// Approach: Optimal (Two Pointers)
// Time Complexity: O(n) - array ka aadha traverse
// Space Complexity: O(1) - koi extra space nahi


public class ReverseStringOptimal {

    public static void reverseString(char[] s) {

        // Step 1: Do pointers lo
        // Left pointer shuru se, Right pointer end se
        int left = 0;
        int right = s.length - 1;

        // Step 2: Jab tak left pointer right se chota hai
        while (left < right) {

            // Step 3: Dono elements swap karo
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Step 4: Left aage badho, Right peeche aao
            left++;
            right--;
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