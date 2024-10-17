class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int floor=-1;
        int ceil=-1;
        
        int l = 0;
        int r = n-1;
        
        while(l<=r){
            int mid = (l+r)/2;
            
            if(arr[mid]==x){
                floor=arr[mid];
                ceil=arr[mid];
                break;
            }
            
            else if(arr[mid]<=x){
                floor=arr[mid];
                l=mid+1;
            }
            
            else{
                ceil=arr[mid];
                r=mid-1;
            }
            
             
        }
        return new int[] {floor,ceil};
    }
}