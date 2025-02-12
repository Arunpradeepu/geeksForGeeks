class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        int cnt=0;
        Node temp = head;
        
        while(temp!=null){
            cnt++;
            if(cnt==x){
                break;
            }
            temp=temp.next;
        }
        
        if(temp.prev==null&&temp.next==null){
            return null;
        }
        else if(temp.prev==null){
            head=head.next;
            head.prev=null;
            return head;
        }
        else if(temp.next==null){
            temp.prev.next=null;
            return head;
        }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            temp.next=null;
            temp.prev=null;
            return head;
        }
        
    }
}
