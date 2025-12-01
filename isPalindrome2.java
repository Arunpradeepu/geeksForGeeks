class Solution {
    boolean isPalindrome(String s) {
        // code here
        int left = 0;
        int right = s.length()-1;
        Boolean ans = helper(s,left,right);
        return ans;
    }
    static Boolean helper(String s,int left,int right){
        if(left > right){
            return true;
            
        }
        
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        
        return helper(s,left+1,right-1);
        
        
        
        
        
        
    }
}