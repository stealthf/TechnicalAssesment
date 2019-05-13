//At the beginning I was thinking to calculate x*x n times, but I found it exceeded the time limit. Then I tried another way to do it. 
class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n == 2)
            return x * x;
        if(n % 2 == 0)
            return myPow(myPow(x, n/2), 2);
        if(n < 0)
            return (1 / x) * myPow(myPow(x, n/2), 2);
        else
            return x * myPow(myPow(x, n/2), 2);
    }
}
