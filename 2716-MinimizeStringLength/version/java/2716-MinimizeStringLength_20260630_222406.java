// Last updated: 6/30/2026, 10:24:06 PM
1class Solution {
2    public int minimizedStringLength(String s) {
3        //freq map approach
4        //hashset approach
5        HashSet<Character> set = new HashSet<>();
6        for(int i = 0; i < s.length(); i++){
7            set.add(s.charAt(i));
8        }
9        return set.size();
10    }
11}