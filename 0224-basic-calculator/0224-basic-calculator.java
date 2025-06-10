class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0 , sign = 1 , res  = 0 ;
        for(char ch : s.toCharArray()){
            // CASE 1 : character is Digit
            if(Character.isDigit(ch)){
                num = num*10 + (ch - '0');
            }
            else if(ch == '+'){
                res =res + (num*sign) ;
                num = 0 ;
                sign = 1 ;
            }
            else if(ch == '-'){
                res =res + (num*sign) ;
                num = 0 ;
                sign = -1 ;
            }
            else if(ch == '('){
                stack.add(res);
                stack.add(sign);

                res = 0 ;
                sign = 1 ;
            }
            else if(ch == ')'){
                res = res + (num*sign);
                res = res * stack.pop();
                res = res + stack.pop();

                num = 0 ;
            }
        }
        res = res + (num*sign);
        return res ;
    }
}