// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        int i = s.length()-1;
        StringBuilder sb = new StringBuilder();
        helper(s,i,sb);
        return sb.toString();
    }
    
    static void helper(String s,int i,StringBuilder sb){
        
        
        if(i<0){
            return;
            
        }
        
        sb.append(s.charAt(i));
        
        helper(s,i-1,sb);
        
        
    }
}