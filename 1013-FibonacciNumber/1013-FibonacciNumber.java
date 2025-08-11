// Last updated: 8/12/2025, 12:40:39 AM
class Solution {
    public int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
}