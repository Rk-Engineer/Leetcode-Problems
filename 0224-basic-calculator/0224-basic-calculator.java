class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num =0 , res =0 , sign = 1 ; 
        for(int i = 0 ;i< s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + ch-'0' ;
            }
            else if (ch == '+'){
                res+= num* sign ;

                num =0 ;
                sign = 1 ;
            }
            else if (ch == '-'){
                res+= num* sign ;

                num =0 ;
                sign = -1 ;
            }
            else if (ch == '('){
                stack.add(res);
                stack.add(sign);

                res =0 ;
                sign = 1 ;
            }
            else if (ch == ')'){
                res+= num* sign ;
                res*= stack.pop();
                res+= stack.pop();
                num =0 ;
            }
        }
        res += (num *sign) ;
        return res ;
    }
}