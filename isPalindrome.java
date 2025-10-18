class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int rev = 0;
        int init = n;
        
        while(n>=1){
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }
        
        return init==rev;
    }
}