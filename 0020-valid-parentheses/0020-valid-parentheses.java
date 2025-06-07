class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            // case 1 : Open Brackets
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            // case 2 : close Brackets
            else{
                if(stack.isEmpty()) return false ;

                char top = stack.pop() ;

                if(ch == ']' && top != '[' || ch == '}' && top != '{' || ch == ')' && top!= '('){
                    return false ;
                }
            } 
        }
        return stack.isEmpty();
    }
}