class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int [] b = new int[26];
            for(char num : s.toCharArray()){
                b[num - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int c : b){
                sb.append(c).append('-');
            }
            String ans = sb.toString();
            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(s);
        }
        return new ArrayList<>(map.values());
    }
}