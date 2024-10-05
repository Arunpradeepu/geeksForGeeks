class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max1=arr[0];
        int n=arr.length;
        int max2=-1;
        for (int i=1;i<n;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
                
            }
            else if(arr[i]<max1 && arr[i]>max2){
                max2=arr[i];
            }
            
        }
        return max2;
       
    }
}