class Solution
{
    public static class Midelement{
        public static int func(int mid,int n,int m){
            long ans=1;
            for(int i=1;i<=n;i++){
                ans=ans*mid;
                if(ans>m){
                    return 2;
                }
            }
            if(ans==m){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    public int NthRoot(int n, int m)
    {
        // code here
        int l=1;
        int r=m;
       
        
        while(l<=r){
            int mid=(l+r)/2;
            
            int midN=Midelement.func(mid,n,m);
            if(midN==1){
                return mid;
            }
            else if(midN==2){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
           
           
        }
        return -1;
        
        
    }
}