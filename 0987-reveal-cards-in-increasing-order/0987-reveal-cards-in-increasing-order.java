class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        // Sort the Deck
        Arrays.sort(deck);
        // Create a Queue to store index values
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i<deck.length;i++) queue.add(i);
        // create Resultant Array
        int[] res = new int[deck.length];

        for(int num : deck){
            // STEP 1 : Taking (index value) from queue 
            // and it can be used for accessing indexes of (resultant array)
            int index = queue.poll();
            res[index] = num ;

            // STEP 2 : Move second element to Last in Queue
            if(!queue.isEmpty()){
                int second_Index = queue.poll();
                queue.add(second_Index);
            }
        }
        return res ;
    }
}