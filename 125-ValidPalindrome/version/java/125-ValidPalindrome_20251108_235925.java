// Last updated: 11/8/2025, 11:59:25 PM
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int lp = 0;
        int rp = s.length()-1;
        while(lp <= rp) {
            char left = s.charAt(lp);
            char right = s.charAt(rp);
            if(!Character.isLetterOrDigit(left)){
                lp++;
            } else if(!Character.isLetterOrDigit(right)){
                rp--;
            } else {
                if(Character.toLowerCase(left) != Character.toLowerCase(right)){
                    return false;
                }
                lp++;
                rp--;
            }
        }
        return true;
    }
}