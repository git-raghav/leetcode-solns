// Last updated: 11/8/2025, 8:00:18 PM
// Approach 1 (Sorting) Onlogk
// class Solution {
//     public List<List<String>> groupAnagrams(String[] str) {
//         HashMap<String, ArrayList<String>> map = new HashMap<>();
//         for (int i = 0; i < str.length; i++) {
//             char arr[] = str[i].toCharArray();
//             Arrays.sort(arr);
//             String key = String.valueOf(arr);

//             if(!map.containsKey(key)){
//                 map.put(key, new ArrayList<>());
//             }
//             map.get(key).add(str[i]);
//         }

//         ArrayList<List<String>> resultList = new ArrayList<>();
//         for(String key : map.keySet()){
//             resultList.add(map.get(key));
//         }
//         return resultList;
//     }
// }

//approach 2 frequency On
class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String freqString = getFreqString(str[i]);

            if(!map.containsKey(freqString)){
                map.put(freqString, new ArrayList<>());
            }
            map.get(freqString).add(str[i]);
        }

        ArrayList<List<String>> resultList = new ArrayList<>();
        for(String key : map.keySet()){
            resultList.add(map.get(key));
        }
        return resultList;
    }

    private String getFreqString(String str){
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for (int i = 0; i < freq.length; i++) {
            sb.append(c);
            sb.append(freq[i]);
        }
        return sb.toString();
    }
}