package Heaps;

public class HeapPQ {
	
	private int[] pq;
	private int N=0;
	
	public HeapPQ(int maxValue) {
		pq = new int[maxValue];
	}
	
	public boolean isEmpty() {
		return N==0;
	}
	
	public int size() {
		return N;
	}
	
	public void insert(int v) {
		//insert at the end 
		//swim to its correct position
		pq[N] = v;
//		N++;
		swim(N);
		N++;
	}
	
	public boolean compare(int i, int j) {
		return pq[i] <pq[j];
	}
	
	public void swap(int i, int j) {
		int temp=pq[i];
		pq[i]=pq[j];
		pq[j]=temp;
	}
	
	public void swim(int k) {
		while(k>0 && pq[k/2] < pq[k]) {
			swap(k/2,k);
			k=k/2;
		}
	}
	
	public void sink(int k) { //k is the current positon
		while(2*k <N ) {
			//find if any child is less than current
			int child;
			if((2*k) < (2*k+1)) {
				child = 2*k+1;
			} else  child = 2*k;
			//if k is greater than descendent then break
			if(k<child) break;
			swap(k, child);
			k=child;
			
		}
		
	}
	
	public int deleteMax() {
		int max = pq[0];
		//swap with the last element in the queue
		swap(0, N--);
		pq[N++] = 0; //set to null or zero; 
		sink(0);
		return max;
	}
	
	
	public String toString() {
		String res ="";
		for(int i=0; i<pq.length; i++) {
			res= res + pq[i] + ", ";
		}
		return res;
	}

}
