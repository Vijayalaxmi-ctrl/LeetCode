class Solution {
    public int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for(int i = 2; i < n ;i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a + b;
    
    }

    // public int fibonacci(int n) {
    //     if(n <= 1) {
    //         return n;
    //     }
    //     int last = fibonacci(n-1);
    //     int secLast = fibonacci(n-2);
    //     return last + secLast;
    // }
}