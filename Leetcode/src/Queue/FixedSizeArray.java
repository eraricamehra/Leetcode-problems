package Queue;

public class FixedSizeArray {
	private int[] queue;
	private int size, front, rear;
	
	private static int capacity = 16;
	
	public FixedSizeArray() {
		queue = new int[capacity];
		front =0;
		rear  =0;
		size=0;
	}
	
	public FixedSizeArray(int k) {
		queue = new int[k];
		front =0;
		rear  =0;
		size=0;
	}
	//insert an element in the rear end of the queue
	public void enQueue(int data) throws Exception {
		if(size == capacity ) throw new Exception("Queue is Full");
		else {
			size++;
			queue[rear] = data;
			rear = (rear +1) % capacity;
		}
	}
	
	
	public int dequeue() throws Exception {
		if(size == 0)  throw new Exception("Queue is Empty. Cannot dequeue");
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
    
    
    public String toString() {
    	String result = "";
    	for (int i=0; i< size(); i++) {
    		result += queue[(front+i) % size()];
    		result += ", ";
    	}
    	return result;
    }

}
