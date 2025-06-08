class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            // Case 1 : Close Brackets
            if(ch == ')'){
                if(stack.isEmpty()) stack.push(ch);
                else if(stack.peek() == ')') stack.push(ch);
                else stack.pop();
            }
            // Case 2 : Open Brackets 
            else{
                stack.push(ch);
            }
        }
        return stack.size();
    }
}