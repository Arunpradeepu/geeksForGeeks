
class Item{
    int val;
    int wt;
    
    public Item(int val,int wt){
        this.val = val;
        this.wt = wt;
    }
}

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        
        
        Item[] items = new Item[val.length];
        
        for(int i=0;i<wt.length;i++){
            items[i] = new Item(val[i],wt[i]);
        }
        
        Arrays.sort(items,(a,b) ->
            Double.compare(
                (double) b.val/b.wt ,   
                (double) a.val/a.wt 
            )
        );
        
        
        double ans = 0;
        for(int i=0;i<val.length;i++){
            if(items[i].wt <= capacity){
                ans+=items[i].val;
                capacity -= items[i].wt;
            }
            else{
                ans += ((double) items[i].val / items[i].wt) * capacity;
                break;
            }
        }
        
        return ans;
    }
}