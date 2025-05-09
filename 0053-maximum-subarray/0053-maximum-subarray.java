class Solution {
    public int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE ;
        int curr = 0 ;

        for(int num : nums){
            // case 1 : summation 
            curr+= num ;

            // store result 
            if(curr > maxi ) maxi = curr ;

            // case 2 : if curr contains negative number
            if(curr<0){
                curr = 0 ;
            }
        }

        return maxi ;
    }
}