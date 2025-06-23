class Node{
    String url ;
    Node prev ;
    Node next ;
    public Node(String url){
        this.url = url ;
    }
} 
class BrowserHistory {

    Node head, curr, tail;

    public BrowserHistory(String homepage) {
        // Create head(homepage)
        // for traversal create two points --> curr and tail
        // curr --> used to traverse both backward and frontward of a website
        // tail --> it is used to describe the last node
        head = new Node(homepage);
        curr = head ;
        tail = head ;
    }
    
    public void visit(String url) {
        // visiting new page
        Node page = new Node(url);
        curr.next = page ;
        page.prev = curr ;
        // move curr and tail to visiting page
        curr = page ;
        tail = page ;
    }
    
    public String back(int steps) {
        // Moving backward by number of steps
        while(steps > 0){
            if(curr == head) break ;

            curr = curr.prev ;
            steps-- ;
        } 
        return curr.url ;
    }
    
    public String forward(int steps) {
        // Moving frontward by number of steps
        while(steps > 0){
            if(curr == tail) break ;

            curr = curr.next ;
            steps-- ;
        } 
        return curr.url ;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */