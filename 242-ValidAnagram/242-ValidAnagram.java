// Last updated: 8/12/2025, 12:41:17 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length()){
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            Arrays.sort(sChars);
            Arrays.sort(tChars);
            return Arrays.equals(sChars,tChars);
        } else return false;
    }
}