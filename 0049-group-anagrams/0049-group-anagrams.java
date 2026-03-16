class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] ch = word.toCharArray(); // convert to char array
            Arrays.sort(ch);                // sort letters
            String key = new String(ch);    // make sorted word

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        
        return new ArrayList<>(map.values());
    }
}
    