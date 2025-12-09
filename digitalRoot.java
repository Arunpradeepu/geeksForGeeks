class Solution {
    public static int digitalRoot(int n) {
        // code here
        
        
        while(n >= 10){
            int sum = 0;
            while(n > 0){
                int ld = n % 10;
                sum += ld;
                n = n / 10;
            }
            n = sum;
            
            
        }
        return n;
    }
}