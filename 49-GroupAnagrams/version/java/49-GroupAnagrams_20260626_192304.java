// Last updated: 6/26/2026, 7:23:04 PM
1// Approach 1 (Sorting) Onlogk
2// class Solution {
3//     public List<List<String>> groupAnagrams(String[] str) {
4//         HashMap<String, ArrayList<String>> map = new HashMap<>();
5//         for (int i = 0; i < str.length; i++) {
6//             char arr[] = str[i].toCharArray();
7//             Arrays.sort(arr);
8//             String key = String.valueOf(arr);
9
10//             if(!map.containsKey(key)){
11//                 map.put(key, new ArrayList<>());
12//             }
13//             map.get(key).add(str[i]);
14//         }
15
16//         ArrayList<List<String>> resultList = new ArrayList<>();
17//         for(String key : map.keySet()){
18//             resultList.add(map.get(key));
19//         }
20//         return resultList;
21//     }
22// }
23
24//approach 2 frequency O(n)
25class Solution {
26    public List<List<String>> groupAnagrams(String[] str) {
27        HashMap<String, ArrayList<String>> map = new HashMap<>();
28        for(int i = 0; i < str.length; i++){
29            String freqString = getFreqString(str[i]);
30
31            if(!map.containsKey(freqString)){
32                map.put(freqString, new ArrayList<>());
33            }
34            map.get(freqString).add(str[i]);
35        }
36
37        ArrayList<List<String>> resultList = new ArrayList<>();
38        for(String key : map.keySet()){
39            resultList.add(map.get(key));
40        }
41        return resultList;
42    }
43
44    private String getFreqString(String str){
45        int freq[] = new int[26];
46        for(int i = 0; i < str.length(); i++){
47            freq[str.charAt(i) - 'a']++;
48        }
49
50        StringBuilder sb = new StringBuilder();
51        char c = 'a';
52        for(int i = 0; i < freq.length; i++){
53            sb.append(c);
54            sb.append(freq[i]);
55            c++;
56        }
57        return sb.toString();
58    }
59}