class Solution {
    public int fib(int n) {
        return fibonacci(n);
    }

    public int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        int last = fibonacci(n-1);
        int secLast = fibonacci(n-2);
        return last + secLast;
    }
}