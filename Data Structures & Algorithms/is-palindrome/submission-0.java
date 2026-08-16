class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++; // skip non-alphanumeric from left
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--; // skip non-alphanumeric from right
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false; // mismatch found, not a palindrome
            }
            left++;
            right--; // move inward after successful compare
        }
        return true; // all valid chars matched
    }
}
