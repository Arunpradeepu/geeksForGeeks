class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        
        DLLNode temp=head;
        DLLNode last=null;
        
        if(temp.next==null&&temp.prev==null){
            return head;
        }
        
        while(temp!=null){
            last=temp.prev;
            temp.prev=temp.next;
            temp.next=last;
            temp=temp.prev;
        }
        return last.prev;
    }
}
