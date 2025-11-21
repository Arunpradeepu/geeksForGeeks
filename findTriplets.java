class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            int j = i+1;
            int k = arr.length - 1;
            
            
            
            while(j<k){
                int tot = arr[i] + arr[j] + arr[k];
                
                if(tot > 0){
                    k--;
                }
                else if(tot < 0){
                    j++;
                }
                else{
                    return true;
                }                
            }
            

        }
        return false;
    }
}