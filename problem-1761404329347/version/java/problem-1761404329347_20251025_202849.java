// Last updated: 10/25/2025, 8:28:49 PM
class Solution {
    public String lexSmallest(String s) {
        String best = s;
        int n = s.length();

        for(int k = 1; k <= n; k++){
            String firstRev = new StringBuilder(s.substring(0, k)).reverse().append(s.substring(k)).toString();
            if(firstRev.compareTo(best) < 0) {
                best = firstRev;
            }
            String lastRev = s.substring(0, n-k) + new StringBuilder(s.substring(n-k)).reverse().toString();
            if(lastRev.compareTo(best) < 0) {
                best = lastRev;
            }
        }

        return best;
    }
}