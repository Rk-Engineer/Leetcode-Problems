class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0 , right = 0 , maxi = 0 ;

        while(right < s.length()){
            // case 1 : element present in hashset 
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++ ;
            }

            // case 2 : element not present in hashset
            set.add(s.charAt(right));
            maxi = Math.max(maxi, right - left + 1);
            right++ ;
        }

        return maxi ;
    }
}