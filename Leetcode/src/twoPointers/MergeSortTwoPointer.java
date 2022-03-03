package twoPointers;

import java.util.ArrayList;

public class MergeSortTwoPointer {

	public int[] merge(int[] a, int[] b) {
		int i = 0, j = 0, k = 0;
		int size = a.length + b.length;
		int temp[] = new int[size];
		while (i <= a.length - 1 && j <= b.length - 1) {
			if (a[i] < b[j]) {
				temp[k] = a[i];
				i++;
				k++;
			} else {
				temp[k] = b[j];
				j++;
				k++;
			}
		}

		while (i <= a.length - 1) {
			temp[k] = a[i];
			i++;
			k++;
		}

		while (j <= b.length - 1) {
			temp[k] = b[j];
			j++;
			k++;
		}

		
		for(int x =0; x <=temp.length-1; x++) {
			System.out.println(temp[x]);
		}
		return temp;
	}
	//Time complexity O(N+M)
	
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int i = 0, j = 0, k = 0;
		ArrayList<Integer> result = new ArrayList<>();
		while (i <= a.size() - 1 && j <= b.size() - 1) {
			if (a.get(i) < b.get(j)) {
				result.add(a.get(k));
				k++;
				i++;
			} else {
				result.add(b.get(k));
				k++;
				j++;
			}
		}
		
		while (i <= a.size() - 1) {
			result.add(a.get(k));
			k++;
			i++;
		}
        
		while (j <= b.size() - 1) {
			result.add(b.get(k));
			k++;
			j++;
		}
    }

}
