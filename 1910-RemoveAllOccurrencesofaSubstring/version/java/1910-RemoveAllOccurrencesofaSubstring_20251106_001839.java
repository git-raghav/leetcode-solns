// Last updated: 11/6/2025, 12:18:39 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)){
            s = s.replaceFirst(part, "");
        }
        return s;
    }
}