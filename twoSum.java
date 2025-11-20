class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        
        while(left < right){
            if(arr[left] + arr[right] == target){
                return true;
            }
            else if(arr[left] + arr[right] > target){
                right = right -1;
            }
            else{
                left = left +1;
            }
            
            
        }
        return false;
    }
}