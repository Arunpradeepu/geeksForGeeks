class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        
        if(arr.length==0){
            return null;
        }
        
        int n =arr.length;
        Node head = new Node(arr[0]);
        Node prev = head;
        
        
        
        for(int i=1;i<n;i++){
            Node temp = new Node(arr[i]);
            prev.next=temp;
            temp.prev=prev;
            prev=temp;
        }
        return head;
        
    }
}