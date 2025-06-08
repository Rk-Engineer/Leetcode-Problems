class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> close = new Stack<>();
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            // Case 1 : Open Brackets
            if(ch == '(') open.push(i);
            // Case 2 : Close Brackets
            else{
                if(!open.isEmpty()) open.pop();
                else{
                    close.push(i);
                }
            }
        }
        while(!open.isEmpty() && !close.isEmpty()){
            if(open.pop()>close.pop()) count+=2 ;
        }
        while(!open.isEmpty()){
            open.pop();count++;
        }while(!close.isEmpty()){
            close.pop();count++;
        }
        return count ;
    }
}