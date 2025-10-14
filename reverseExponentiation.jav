class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int base = n;
        int rev = 0;
        
        while(n>=1){
            int r = n%10;
            rev = rev*10 + r;
            n=n/10;
        }
        int power = (int)Math.pow(base,rev);
        return power;
        
    }
}