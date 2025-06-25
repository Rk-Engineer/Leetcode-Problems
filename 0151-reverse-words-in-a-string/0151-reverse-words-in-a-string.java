class Solution {
    public String reverseWords(String s) {
        // Trim the Whitespaces :
        s = s.trim();

        int index = s.indexOf(' ');
        // BASE CASE : Single word directly return 
        if(index == -1) return s ;

        String word = s.substring(0,index);
        String rem = s.substring(index + 1);

        // RECURSIVE CASE :
        return reverseWords(rem) + " " + word ; 
    }
}