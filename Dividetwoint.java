// leetcode (29) Divide two integer
class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor==0) throw new ArithmeticException("Division by zero");
        if (dividend==Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE; 
        return dividend / divisor;
    }
}