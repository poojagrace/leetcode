class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.strStr("hello", "ll"));    // Corrected typo: "11" to "ll"
        System.out.println(sol.strStr("abcdef", "def"));
        System.out.println(sol.strStr("abc", "d"));
    }
}
