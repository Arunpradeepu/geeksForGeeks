class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i=1;i<n;i++){
            
            if(arr[i]>max){
                max = arr[i];
            }
            
            if(arr[i]<min){
                min = arr[i];
            }
            
        }
        
        res.add(min);
        res.add(max);
        
        return res;
        
        
    }
}
