class Solution {
    public double myPow(double x, int n) {
        // BASE CASES : 
        if (n == 0) return 1 ;
        if (n == 1) return x ;
        if (n == 2) return x*x ;

        // RECURRSIVE CASES :
        // Case 1 : if n is negative 
        if(n<0) return (1/x) * myPow((1/x), -(n+1)); 
        // Case 2 : if n is Even 
        if(n%2 == 0) return myPow(myPow(x,n/2),2);
        // Case 3 : if n is Odd
        else return myPow(myPow(x,n/2),2) * x ;
    }
}