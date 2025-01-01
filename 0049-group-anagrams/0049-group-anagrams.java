class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            //frequency array 
            int[] b = new int[26];
            //add all chars in frequency array 
            for(char num : s.toCharArray()){
                b[num-'a']++ ;
            }
            // create a stringbuilder to store the frequencies
            StringBuilder sb = new StringBuilder();
            for(int c : b){
                sb.append(c).append("-");
            }
            // convert to string 
            String ans = sb.toString();
            // save the key in hash map , if the key is not found 
            map.putIfAbsent(ans,new ArrayList<>());
            // get the key and save the string
            map.get(ans).add(s);
        }
        return new ArrayList<>(map.values());
    }
}