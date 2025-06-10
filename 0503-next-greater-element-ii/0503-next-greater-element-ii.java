class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length ;

        int res[] = new int[n];
        Arrays.fill(res,-1);

        for(int i = 2*n-1 ; i>=0 ; i--){
            // CASE 1 : current element <= top element
            while(!stack.isEmpty() && nums[i%n] >= stack.peek()){
                stack.pop();
            }

            // CASE 2 : Update the res Array
            if(!stack.isEmpty() && i<n){
                res[i] = stack.peek();
            }

            stack.add(nums[i%n]);
        }
        return res ;
    }
}