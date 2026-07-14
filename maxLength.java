class Solution {
    int maxLength(int arr[]) {
        // code here
        int ps = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ind = 0;
        int maxVal = 0;
        
        for(int val : arr){
            ps += val;
            
            if(map.containsKey(ps)){
                int ans = ind - map.get(ps);
                maxVal = (int) Math.max(maxVal,ans);
            }
            
            else{
                map.put(ps,ind);
            }
            
            
            
            ind++;
        }
        
        return maxVal;
    }
}