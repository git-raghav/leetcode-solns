// Last updated: 8/12/2025, 12:42:24 AM
class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            int r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(temp==sum){
            return true;
        }else{
            return false;
        }
    }
}