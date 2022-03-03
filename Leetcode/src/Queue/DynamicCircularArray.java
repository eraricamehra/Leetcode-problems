package Queue;

public class DynamicCircularArray {
	
	private int[] queue;
	private int size, front, rear;
	
	private static int capacity = 5;
	public static int MIN_CAPACITY ;
	
	public DynamicCircularArray() {
		queue = new int[capacity];
		front =0;
		rear  =0;
		size=0;
	}
	
	public DynamicCircularArray(int k) {
		queue = new int[k];
		front =0;
		rear  =0;
		size=0;
	}
	//insert an element in the rear end of the queue
	public void enQueue(int data) throws Exception {
		if(size == capacity ) {
			expand();
		}
		else {
			size++;
			queue[rear] = data;
			rear = (rear +1) % capacity;
		}
	}
	
	
	public int dequeue() throws Exception {
		if(size == 0)  throw new IllegalStateException("Queue is Empty. Underflow");
		else {
			size --;
			int data = queue[front % capacity];
			queue[front] = Integer.MIN_VALUE;
			front = (front +1) % capacity;
			return data;
		}
		
	}
	
	public boolean isEmpty() {
		return (size ==0);
	}
	
    public boolean isFull() {
		return (size == queue.length);
	}
    
    public int size() {
		return size;
	}
    
    public void expand() {
    	int length = size();
		int[] newQueue = new int[length * 2];
		for (int i = 0; i < size(); i++) {
			newQueue[i] = queue[i];
		}
		queue = newQueue;
		front = 0;
		rear = size - 1;
		capacity *= 2;
	}
    
//    public void shrink() {
//    	
//    }
//    
    
    public String toString() {
    	String result = "";
    	for (int i=0; i< size(); i++) {
    		result += queue[(front+i) % size()];
    		result += ", ";
    	}
    	return result;
    }



}
