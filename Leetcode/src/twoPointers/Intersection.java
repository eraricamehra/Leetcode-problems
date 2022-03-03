package twoPointers;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public int[] findIntersection(int a[], int b[]) {

		int i = 0, j = 0, k = 0;
		int size = (a.length < b.length) ? a.length : b.length;
		int[] intersection = new int[size];
		while (i <= a.length - 1 && j <= b.length - 1) {
			if (a[i] == b[j]) {
				intersection[k] = a[i];
				k++;
				i++;
				j++;
			} else if (a[i] < b[j])
				i++;
			else if (a[i] > b[j])
				j++;
		}

		for (int l = 0; l <= intersection.length - 1; l++)
			System.out.println(intersection[l]);

		return intersection;
	}

	public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		ArrayList<Integer> intersection = new ArrayList<Integer>();
		if (A == null || A.size() == 0 || B == null || B.size() == 0) {
			return intersection;
		}
		int i = 0, j = 0;
		while (i <= A.size() - 1 && j <= B.size() - 1) {
			if (A.get(i) < B.get(j)) {
				i++;
			} else if (A.get(i) > B.get(j))
				j++;
			else if (A.get(i).equals(B.get(j))) {
				intersection.add(A.get(i));
				i++;
				j++;
			}
		}
		return intersection;
	}

}
