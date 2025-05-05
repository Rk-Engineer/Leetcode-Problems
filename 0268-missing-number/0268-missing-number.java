class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0 ;
        int n = nums.length ;
        
        // finding sum for given values :
        for (int curr : nums) 
        sum += curr ;

        // finding total sum :
        int total = n*(n+1)/2 ;

        return total - sum ;
    }
}