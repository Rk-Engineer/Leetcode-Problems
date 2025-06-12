class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            // STEP 1 : Add elements in pq
            pq.add(num);

            // STEP 2 : Remove last element if size of PQ exceeds k
            if(pq.size()>k){
                pq.poll();
            }
        }
        // Return the 1st element the pq
        return pq.poll();
    }
}