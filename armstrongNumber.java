// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int sum = 0;
        int init = n;
        
        while(n > 0){
            int digit = n % 10;
            sum = sum + (int)Math.pow(digit,3);
            
            n = n / 10;
        }
        
        return sum == init;
    }
}