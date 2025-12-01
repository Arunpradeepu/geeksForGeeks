class Solution {

    void printNos(int N) {
        // code here
        int i=1;
        helper(N,i);
    }
    
    static void helper(int N,int i){
        if(i > N){
            return;    
        }
        helper(N,i+1);
        System.out.print(i + " ");
    }
}