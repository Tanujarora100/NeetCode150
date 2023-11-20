class Solution {
      public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char curr_char = s.charAt(left);
            if (!Character.isLetterOrDigit(curr_char)) {
                left += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right -= 1;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;
            else {
                left += 1;
                right -= 1;

            }
            

        }
        return true;
    }
}
