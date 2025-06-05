class Solution {
    public String longestPrefix(String s) {
        int m = s.length();   // use --> KMP Algorithm //

        // step 1 : create an empty LPS array 
        int[] lps = new int[m];

        // step 2 : prepare the LPS array
        int i = 1 , prev = 0 ;
        while(i < m){
            // case 1 : character at i and prev pointer matches  
            if(s.charAt(i) == s.charAt(prev)){
                lps[i] = prev + 1 ;
                i++ ;
                prev++ ;
            }
            // case 2 : if character does not matches
            else{
                if( prev == 0 ){
                    lps[i] = 0 ;
                    i++ ;
                }
                else{
                    prev = lps[prev - 1] ;
                }
            } 
            
        }
        int last = lps[lps.length - 1];
        return s.substring(0,last);
    }
}