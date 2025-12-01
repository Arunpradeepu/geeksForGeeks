class Solution {
    static void printTillN(int N) {
        // code here
        int i = 1;
       
        helper(N,i);
    }
    
    static void helper(int N,int i){
        if(i>N){
            return ;
        }
        System.out.print(i + " ");
        helper(N,i+1);
        
        
    }
}