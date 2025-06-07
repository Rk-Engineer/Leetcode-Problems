class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> bracket = new Stack<>();

        for(int i = 0;i< s.length();i++){
            char ch = s.charAt(i);
            // case 1 : Open Brackets 
            if(ch == '(') stack.push(i) ;
            // case 2 : star
            else if(ch == '*') bracket.push(i) ;
            // CASE 3 : Close Brackets 
            else{
                if(!stack.isEmpty()) stack.pop() ;
                else if(!bracket.isEmpty()) bracket.pop() ;
                else return false ;
            }
        }
        while(!stack.isEmpty() && !bracket.isEmpty()){
            if(stack.pop() > bracket.pop()) return false ;
        }
        return stack.isEmpty() ;
    }
}