class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        while(n % 3 == 0) {
            n = n / 3;
        }
       return n == 1; 
    }
    public static void main(String[]args) {
        Solution obj = new Solution();
        int n = 27;
        System.out.println("Is " + n + " a power of three? " + obj.isPowerOfThree(n));
    }
}