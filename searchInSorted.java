class Solution {
    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
    
        int l=0;
        int r=N-1;
        int mid;
        while(l<=r){
            mid=(l+r)/2;
            if (arr[mid]==K){
                return 1;
            }
            
            else if(arr[mid]<K){
                l=mid+1;
                
            }
            
            else {
                r=mid-1;
            }
            
        }
        return -1;    
       
    }
    
}