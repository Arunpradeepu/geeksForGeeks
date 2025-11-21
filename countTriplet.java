class Solution {
    int countTriplet(int arr[]) {
        // code here
        Arrays.sort(arr);
        int count = 0;
        
        for(int k=arr.length-1;k >= 0;k--){
            int j = k - 1;
            int i = 0;
            
            while(i<j){
                int sum = arr[i] + arr[j];
                
                if(sum < arr[k]){
                    i++;
                }
                else if(sum > arr[k]){
                    j--;
                }
                
                else{
                    count++;
                    j--;
                    i++;
                }
                
            }
        }
        return count;
    }
}