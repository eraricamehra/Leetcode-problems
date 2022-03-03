package Queue;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    private List<Integer> data;         
    private int front = -1;
    private int tail = -1;


    public MyCircularQueue(int k) {
        data = new ArrayList<Integer>(k);
        front = 0;
        tail = 0;
    }
    
    public boolean enQueue(int value) {
        data.add(value);
        if(data.size() == 1) tail = 0;
        else tail ++;
        return true;
    }
    
    public boolean deQueue() {
    	if(data.isEmpty()) return false;
        front++;
        return true;
    }
    
    public int Front() {
        return front;
    }
    
    public int Rear() {
        return tail;
    }
    
    public boolean isEmpty() {
        return front <0;
    }
    
    public boolean isFull() {
        return  (data.size() == tail);
    }
}