class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        // STEP 1 : Adding all elements with Frequecy in Hashmap .
        for(int num : nums){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        // STEP 2 : Create Priority Queue and 
        // store elements in decending order according to it Frequencies .
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a) 
        );

        // STEP 3 : Add datas in Priority Queue
        for(int num : map.keySet()){
            pq.add(num);
        }

        // STEP 4 : Store answers in Resultant Array 
        int[] temp = new int[k];
        for(int i = 0 ; i< k ; i++){
            temp[i] = pq.poll();
        }
        return temp ;
    }
}