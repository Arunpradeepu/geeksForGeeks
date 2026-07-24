class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int[][] arr = new int[finish.length][2];
        
        for(int i=0;i<finish.length;i++){
            arr[i][0] = start[i]; 
            arr[i][1] = finish[i]; 
        }
        
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));
        
        int left = 0;
        int right = 1;
        int res = 1;
        
        while(right <= start.length-1){
            if(arr[left][1] < arr[right][0]){
                res++;
                left = right;
            }
            right++;
        }
        
        return res;
    }
}
