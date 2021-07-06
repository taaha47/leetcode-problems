class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        if (x == -1) return n%2 == 0 ? 1 : -1;
        
        return n < 0 ? pow(1/x, -n, 1) : pow(x, n, 1);
    }
    
    private double pow(double x, int n, double acc) {
        if (Math.abs(acc) < 2 * Double.MIN_VALUE) 
            return 0;
        
        if (n == 0) 
            return acc;
        
        if (n % 2 == 0) 
            return pow(x*x, n/2, acc);
        
        return pow(x, n-1, x*acc);
    }
}