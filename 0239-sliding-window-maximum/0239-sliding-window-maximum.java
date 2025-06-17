class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> que = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0 ; i<nums.length ; i++){
            // CASE 1 : if current element > que.top , replace current element to top element
            while(!que.isEmpty() && nums[i] > que.getLast()){
                que.pollLast();
            }
            que.addLast(nums[i]);

            // CASE 2 : Check previous element is there in sliding Window
            if(i>=k && nums[i-k] == que.getFirst()){
                que.pollFirst();
            }
            // CASE 3 : Add greated element to resultant array 
            if( i>= k-1){
                res.add(que.getFirst());
            }
        }
        // Convert to return type array 
        int[] temp = new int[res.size()];
        for(int i = 0 ; i< res.size() ; i++) temp[i]  = res.get(i);

        return temp ; 
    } 
}