class Solution {
    public static int findSum(int n) {
        // code here
        int sum=0;
        int ans = helper(n,sum);
        return ans;
    }
    
    static int helper(int n,int sum){
        if(n == 0){
            return sum;
        }
        sum = sum + n;
        return helper(n-1,sum);
    }
}
