class Solution {

    static int findFloor(long arr[], int n, long x) {
        int ans = n;
        int l = 0;
        int r = n - 1;
        
        while (l <= r) {
            int mid = (l + r) / 2;
            
            if (arr[mid] <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        return (ans < n) ? ans : -1;
    }
}
