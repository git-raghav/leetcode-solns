// Last updated: 8/12/2025, 12:42:09 AM
class Solution {
    public double myPow(double x, int n) {
        if(n==0)
        return 1;

        double ans=0;

        if(n<0){
            n=-n;
            x=1/x;
            ans=x*myPow(x,n-1);
        }

        else if(n%2==0){
            ans=myPow(x*x,n/2);
        }

        else{
            ans=x*myPow(x,n-1);
        }

        return ans;
    }
}