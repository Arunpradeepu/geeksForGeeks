class Solution {
    int minCost(int[] height) {
        // code here
        int[] dp = new int[height.length];
        Arrays.fill(dp,-1);
        int n = height.length;
        int res = helper(height,dp,n-1);
        return res;
    }
    
    public static int helper(int[] height,int[] dp,int n){
        if(n == 0){
            return 0;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        int left = helper(height,dp,n-1) + Math.abs(height[n] - height[n - 1]);
        int right = Integer.MAX_VALUE;
        
        if(n > 1){
            right = helper(height,dp,n-2) + Math.abs(height[n] - height[n - 2]);
        }
        
        return dp[n] = Math.min(left,right);
    }
}