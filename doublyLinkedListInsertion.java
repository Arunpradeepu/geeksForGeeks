class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        int cnt = 0;
        Node temp = head;
        
        Node newNode = new Node(x);
        
        if(head==null){
            return newNode;
        }
        
        
        
        while(temp.next != null && cnt < p){
            temp=temp.next;
            cnt++;
        }
        
        newNode.next=temp.next;
        newNode.prev=temp;
        
        if(temp.next==null){
            temp.next=newNode;
            newNode.next=null;
        }
        temp.next=newNode;
        
        return head;
    }
}