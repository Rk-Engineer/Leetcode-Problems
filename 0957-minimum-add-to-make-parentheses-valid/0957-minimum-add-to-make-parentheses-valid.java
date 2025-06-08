class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> brac = new Stack<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch ==')'){
                if(brac.isEmpty()) brac.add(ch);
                else if(brac.peek()  == ch ) brac.add(ch);
                else brac.pop();
            }
            else{
                brac.add(ch);
            }
        }
        return brac.size();
    }
}