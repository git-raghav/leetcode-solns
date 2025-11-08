// Last updated: 11/8/2025, 2:05:48 PM
class Solution {
    public String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);

        char first[] = arr[0].toCharArray(); //first word
        char last[] = arr[arr.length-1].toCharArray(); //last word

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < first.length; i++){
            if(first[i] != last[i]) break;
            sb.append(first[i]);
        }
        return sb.toString();
    }
}