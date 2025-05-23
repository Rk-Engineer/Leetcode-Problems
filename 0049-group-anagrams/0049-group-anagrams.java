class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Create Hashmap to store anagrams as key-value pairs :
        HashMap<String, List<String>> map = new HashMap<>();

        // traverse all strings : 
        for(String s : strs){
            int[] freqarr = new int[26];
            for(char ch : s.toCharArray()) freqarr[ch - 'a']++ ;

            // Convert Frequency array to String :
            StringBuilder sb = new StringBuilder();
            for(int num : freqarr) sb.append(num).append("-");
            String freq = sb.toString();

            // If Key is not there in Hashmap , create a key :
            if(!map.containsKey(freq)){
                map.put(freq , new ArrayList<>());
            }

            map.get(freq).add(s);
        }
        return new ArrayList<>(map.values());
    }
}