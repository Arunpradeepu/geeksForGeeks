class MyQueue {

    int front, rear;
	int arr[] = new int[100005];
	int current=0;

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    if(current==100005){
	        return;
	    }
	    else{
	        
	        arr[rear]=x;
	        rear=(rear+1) % 100005;
	        current+=1;
	    }
	    // Your code here
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	    if(current==0){
	        return -1;
	    }
	    
	    else{
	        int val=arr[front];
	        front=(front+1) % 100005;
	        current=current-1;
	        return val;
	    }
		// Your code here
	} 
}
