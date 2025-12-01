class Solution {
    public int countDigits(int n) {
        // code here
        int digit = 0;
        int ans = helper(n,digit);
        return ans;
    }
    
    static int helper(int n,int digit){
        if(n==0){
            return digit;
        }
    
           
            
        
        return helper(n/10,digit+1);
        
    }
}
