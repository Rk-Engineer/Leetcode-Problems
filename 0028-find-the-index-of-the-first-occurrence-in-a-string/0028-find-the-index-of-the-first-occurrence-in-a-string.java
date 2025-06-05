class Solution {
    public int[] createLPS(String s) {
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
        return lps ;
    }
    public int strStr(String string, String pattern) {
        int[] lps = createLPS(pattern);

        int n = string.length() , m = pattern.length();
        int i = 0 , j = 0 ;

        while(i<n){
            // case 1 : compare the characters 
            if(string.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            // case 2 : did not match 
            else{
                if ( j == 0 ) i++ ;
                else j = lps[j-1];
            }

            if (j == m) return i-m ;
        }
        return -1 ;
    }
}