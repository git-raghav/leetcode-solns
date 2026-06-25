// Last updated: 6/26/2026, 12:07:07 AM
class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n).replace("0", "");
        return Long.parseLong(s);
    }
}