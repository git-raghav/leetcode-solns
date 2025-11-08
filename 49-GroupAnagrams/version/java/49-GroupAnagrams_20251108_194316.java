// Last updated: 11/8/2025, 7:43:16 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            char arr[] = str[i].toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str[i]);
        }

        ArrayList<List<String>> resultList = new ArrayList<>();
        for(String key : map.keySet()){
            resultList.add(map.get(key));
        }
        return resultList;
    }
}