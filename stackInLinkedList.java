class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;
   
    int size = 0;
    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode temp = new StackNode(a);
        temp.next=top;
        top=temp;
        size+=1;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code here
        if(top==null){
            return -1;
        }
        
        int poppedData = top.data;
        top=top.next;
        size=size-1;
        return poppedData;
        
    }
}