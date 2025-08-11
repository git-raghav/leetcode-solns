// Last updated: 8/12/2025, 12:41:09 AM
class Solution {
    public void reverseString(char[] s) {
        if(s.length == 1) return;
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
        return;
    }
}