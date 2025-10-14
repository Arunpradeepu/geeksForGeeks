class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count=0;
        String s = String.valueOf(n);
        
        for(int i =0 ;i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            
            
            if(digit !=0 && n % digit == 0){
                count++;
            }
            
        }
        return count;
    }
}