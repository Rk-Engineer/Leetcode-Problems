class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // step 1 : declare two pointers 
        int left = 0 , right = nums.length-1 ;

        // step 2 : copy the array and sort 
        int temp[] = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);

        // step 3 : find the index values :
        while(left < right ){
            int sum = temp[left] + temp[right];
            // case 1 : if target value found 
            if( sum == target ) break ;
            // case 2 : sum is less than target
            else if( sum < target ) left++ ;
            // case 3 : sum is greater than target  
            else right-- ;
        }

        // resultant array :
        int []res = new int[2];
        Arrays.fill(res,-1);

        for(int i = 0 ; i<nums.length ; i++ ){
            if(temp[left]== nums[i] && res[0]== -1){
                res[0]=i ;
            }
            else if(temp[right] == nums[i] && res[1] == -1){
                res[1]=i;
            }
        }

        return res ;
    }
}