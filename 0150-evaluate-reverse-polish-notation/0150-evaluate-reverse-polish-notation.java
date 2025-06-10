class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String element : tokens ){
            // CASE 1 :
            if(element.equals("+")){
                int rhs = stack.pop();
                int lhs = stack.pop();
                stack.add(lhs+rhs);
            }
            // CASE 2 :
            else if(element.equals("-")){
                int rhs = stack.pop();
                int lhs = stack.pop();
                stack.add(lhs-rhs);
            }
            // CASE 3 :
            else if(element.equals("*")){
                int rhs = stack.pop();
                int lhs = stack.pop();
                stack.add(lhs*rhs);
            }
            // CASE 4 :
            else if(element.equals("/")){
                int rhs = stack.pop();
                int lhs = stack.pop();
                stack.add(lhs/rhs);
            }
            // CASE 5 : If element is digit , then add it to stack . 
            else{
                stack.add(Integer.parseInt(element));
            }
        }
        return stack.pop();
    }
}