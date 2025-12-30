class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        boolean ans = helper(arr,1);
        return ans;
    }
    
    static boolean helper(int arr[],int i){
        if(i == arr.length){
            return true;
        }
        
        if(arr[i] < arr[i-1]){
            return false;
        }
        
        
        return helper(arr,i+1);
        
        
    }
}