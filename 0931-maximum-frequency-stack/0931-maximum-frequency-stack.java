class FreqStack {
    HashMap<Integer,Integer> map ;
    PriorityQueue<int[]> pq ;
    int index ;
// Empty Frequency Stack :
    public FreqStack() {
        map = new HashMap<>();
        pq = new PriorityQueue<>(
            (a,b) ->{
                if(a[1] != b[1]) return b[1]-a[1]; //store through frequency in descending
                else return b[2] - a[2] ;  // store through index in descending
            }
        );
        index = 0 ;
    }
// Inserting elements to Stack : 
    public void push(int val) {
        map.put(val , map.getOrDefault(val , 0)+1);
        index++;
        pq.add(new int[]{val, map.get(val), index});
    }
// Pop the most frequent elemets :
    public int pop() {
        int[] temp = pq.poll();
        map.put(temp[0] , temp[1]-1);
        return temp[0];
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */