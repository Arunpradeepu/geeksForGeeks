class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int l = 0;
        int r = arr.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        
        
        while(l <= r){
            int mid = (l + r)/2;
            
            if(arr[mid] == x){
                ans.set(0, mid);
                r = mid-1;
            }
            else if(arr[mid] > x){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        
        l = 0;
        r = arr.length-1;
        
        while(l <= r){
            int mid = (l + r)/2;
            
            if(arr[mid] == x){
                ans.set(1, mid);
                l = mid + 1;
            }
            else if(arr[mid] > x){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        
        return ans;
    }
}
