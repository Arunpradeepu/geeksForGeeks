class Solution {
    long floorSqrt(long n) {
        long low=1;
        long ans=n;
        long high=n;
        while(low<=high){
            long mid=(low+high)/2;
            if((mid*mid)<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
