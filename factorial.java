class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        int mul = 1;
        int ans = helper(n,mul);
        return ans;
    }
    
    static int helper(int n,int mul){
        if(n==0){
            return mul;
        }
        mul *= n;
        return helper(n-1,mul);
        
    }
}
