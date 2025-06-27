class Solution {
    private void helper(int[] nums, List<List<Integer>> res, List<Integer> temp, boolean[] visited){
        // BASE CASE :
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return ; // stops the Recursion 
        } 
        // RECURSIVE CASE :
        for(int i = 0 ; i<nums.length ; i++){
            if(!visited[i]){
                visited[i] = true ;
                temp.add(nums[i]);

                helper(nums,res,temp,visited);

                // After the Recursion 
                visited[i] = false ;
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length] ;

        helper(nums,res,temp,visited) ;

        return res ;
    }
}