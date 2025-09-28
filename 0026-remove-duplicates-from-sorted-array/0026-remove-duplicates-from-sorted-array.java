class Solution {
    public int removeDuplicates(int[] nums) {
        int prev = 1;
        for(int i = 1; i<nums.length; i++){
            // case 2 : if it is not same and higher than previous 
            if(nums[i-1]<nums[i]){
                nums[prev]= nums[i];
                prev++ ;
            }
        }
        return prev ;
    }
}