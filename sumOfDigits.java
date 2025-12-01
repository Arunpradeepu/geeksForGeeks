class Solution {
    static int sumOfDigits(int n) {
        // code here
        int sum = 0;
        return helper(n,sum);
    }
    
    static int helper(int n,int sum){
        if(n == 0){
            return sum;
        }
        
        int digit = n % 10;
        n = n / 10;
        sum += digit;
        
        return helper(n,sum);
    } 
}
