public class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return false;
            }

            reversed = reversed * 10 + digit;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(121));   
        System.out.println(sol.isPalindrome(-121));
        System.out.println(sol.isPalindrome(10));
        
        
    }
}
