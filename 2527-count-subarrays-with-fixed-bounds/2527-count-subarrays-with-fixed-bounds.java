class Solution {
    public long countSubarrays(int[] nums, int mink, int maxk) {
        Queue<Integer> queue =  new LinkedList<>();
        long res = 0 ;
        int minPos = -1 , maxPos = -1 ;

        for(int num : nums){
            // CASE 1 : If num fall in Range 
            if(num >= mink && num <= maxk){
                queue.add(num);

                if( num == mink) minPos = queue.size();
                if( num == maxk) maxPos = queue.size();

                if(minPos != -1 && maxPos != -1 ){
                    res += Math.min(minPos , maxPos);
                }
            }
            // CASE 2 : If num falls out of Range
            else{
                queue.clear();

                minPos = -1 ;
                maxPos = -1 ;
            }

        }
        return res ;
    } 
}