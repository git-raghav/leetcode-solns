// Last updated: 8/12/2025, 12:40:18 AM
class Solution {
    public static List<String> binaryString(int n, int lastPlace, String str, List list) {
        if (n == 0) {
            list.add(str);
            return list;
        }
        
        if (lastPlace == 1) {
            binaryString(n - 1, 0, str + "0", list);
            binaryString(n - 1, 1, str + "1", list);
        } else binaryString(n - 1, 1, str + "1", list);
        
        return list;
    }
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        return binaryString(n, 1, "", list);
    }
}