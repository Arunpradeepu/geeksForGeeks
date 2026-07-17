class Solution {
    static int maximizeMoney(int N, int K) {
        // code here
        int[] arr = new int[N];
        int[] dp = new int[N];
        Arrays.fill(dp,-1);
        
        for(int i=0;i<N;i++){
            arr[i] = K;
        }
        
        int ans = house(N-1,arr,dp);
        return ans;
    }
    
    public static int house(int n,int[] arr,int[] dp){
        if(n == 0){
            return arr[0];
        }
        if(n == 1){
            return Math.max(arr[0] , arr[1]);
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        
        int left = house(n-1,arr,dp);
        
        int right = Integer.MIN_VALUE;
        
        if(n > 1){
            right = house(n - 2,arr,dp) + arr[n];
        }
        
        return dp[n] = Math.max(left,right);
    }
};