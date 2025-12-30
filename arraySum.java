// User function Template for Java

class Solution {
    
    int arraySum(int arr[]) {
        // code here
        int ans = recSum(arr,0,0);
        return ans;
    }
    
    static int recSum(int[] arr,int i,int sum){
        
        if(i > arr.length-1){
            return sum;
        }
        
        return recSum(arr,i+1,sum+arr[i]);
        
    }
}
