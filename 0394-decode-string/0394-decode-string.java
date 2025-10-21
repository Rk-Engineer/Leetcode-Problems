class Solution {
    int index = 0;
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        while(index<s.length() && s.charAt(index) != ']'){
            char c = s.charAt(index);
            // if character is number
            if(Character.isDigit(c)){
                int number = 0;
                // for two  or more digit numbers
                while(Character.isDigit(s.charAt(index))){
                    number = number * 10 +( s.charAt(index) - '0' );
                    index++;
                }

                index++;
                // recursion for collecting characters in string
                String value = decodeString(s);
                index++;
                for(int i =0;i<number;i++) sb.append(value);
            } 
            else{
                sb.append(c);
                index++;
            }
        }
        return sb.toString();
    }
}