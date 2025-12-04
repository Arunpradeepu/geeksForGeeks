// User function Template for Java

class Solution {
    static List<List<Integer>> ans;
    
    public static List<List<Integer>> combinationSum2(int[] a, int s) {
        ans = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        Arrays.sort(a);
        helper(a,s,0,ds);
        return ans;
    }
    
    static void helper(int[] a,int s,int ind,ArrayList<Integer> ds){
        if(s == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        
        
        for(int i = ind;i<a.length;i++){
            if(i > ind && a[i] == a[i-1]){
                continue;
            }
            
            if(a[i] > s){
                break;
            }
            
            ds.add(a[i]);
            helper(a,s-a[i],i+1,ds);
            ds.remove(ds.size()-1);
            
        }
    }
}