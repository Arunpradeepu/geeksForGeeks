// User function Template for Java

class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        //   code here
        int n = arr.length-1;
        helper(arr,0,n);
    }
    static void helper(int arr[],int i,int n){
        if(i > n){
            return;
        }
        
        System.out.print(arr[i] + " ");
        helper(arr,i+1,n);
    }
}