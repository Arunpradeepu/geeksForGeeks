class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
      
        
        
        
        for(int i=0;i<arr.length;i++){
            
            
            int j = i+1;
            int k = arr.length-1;
            
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == target){
                    return true;
                }
                
                else if(sum > target){
                    k--;
                    
                }
                else{
                    j++;
                    
                }
                
                
                
            }
        }    
        return false;
    }
}
