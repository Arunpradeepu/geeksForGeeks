class Solution {
    
    
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
    
        if(root == null) return ans;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> sub = new ArrayList<>();
            
            for(int i=0;i<n;i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);
                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                sub.add(q.poll().data);
                
                
            }
            ans.add(sub);
        }
        return ans;
        
        
    }
}