// Last updated: 10/26/2025, 8:15:48 AM
class Solution {
    public long removeZeros(long n) {
        String s = String.valueOf(n).replace("0", "");
        return Long.parseLong(s);
    }
}