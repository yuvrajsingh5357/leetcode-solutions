class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int left = 0, right = chars.length - 1;
        while (left <= right) {
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(chars[right])) {
                right--;
                continue;
            }
            if (chars[left] != chars[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}