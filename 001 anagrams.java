class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        LinkedHashMap<List<Integer>, List<String>> map = new LinkedHashMap<>();
        for(String s : string_list) {
            List<Integer> freq = new ArrayList<Integer>();
            for(int i = 0; i < 26; i++) freq.add(0);
            for(char c : s.toLowerCase().toCharArray()) freq.set(c-'a', freq.get(c-'a')+1);
            if(map.containsKey(freq)) map.get(freq).add(s);
            else {
                List<String> t = new ArrayList<>();
                t.add(s);
                map.put(freq, t);
            }
        }
        return new ArrayList<>(map.values());
    }
}
