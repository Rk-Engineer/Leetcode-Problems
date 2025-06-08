class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int res = 0 ;
        for(int i = 0 ; i<s.length() ;i++){
            char ch = s.charAt(i);
            // case 1 : Open Brackets
            if(ch == '('){
                stack.push(i);
            }
            // case 2 : Close Brackets
            else{
                stack.pop();
                if(stack.isEmpty()) stack.push(i);
                res = Math.max(res , i - stack.peek());
            }
        }
        return res ;
    }
}