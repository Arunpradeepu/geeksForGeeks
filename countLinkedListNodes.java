class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int count=0;
        Node temp = head;
        
        if(temp==null){
            return 0;
        }
        
        while(temp != null){
            temp=temp.next;
            count+=1;
        }
        return count;
        
    }
}