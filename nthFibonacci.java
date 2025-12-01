class Solution {
    public int nthFibonacci(int n) {
        // code here
        int ans = helper(n);
        return ans;
    }
    static int helper(int n){
        if(n == 0){
            return 0;
        }
        
        if(n==1){
            return 1;
        }
        
        
        int left = helper(n-1);
        int right = helper(n-2);
        
        int sum = left + right;
        
        return sum;
        
    }
}