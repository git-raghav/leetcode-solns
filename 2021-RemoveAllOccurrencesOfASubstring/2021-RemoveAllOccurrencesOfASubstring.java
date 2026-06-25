// Last updated: 6/26/2026, 12:07:17 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}