package twoPointers;

import java.util.ArrayList;

public class RemoveDuplicatesInPlace {

	public int removeDuplicates(ArrayList<Integer> a) {

		int i = 0, j = 1;
		if (a == null || a.size() == 0)
			return 0;
		if (a.size() == 1)
			return 1;
		while (i < j && i <= a.size() - 1 && j <= a.size() - 1) {
			if (a.get(i) < a.get(j)) {
				a.set(++i, a.get(j));
				j++;
			} else {
				j++;
			}
		}
		a.subList(i, a.size() - 1).clear();
		System.out.println(a);
		return a.size();
	}

	public int removeDuplicatesArray(int[] a) {

		int i = 0, j = 1;
		int result = a.length;
		if (a == null || a.length == 0)
			return 0;
		if (a.length == 1)
			return 1;
		while (i < j && i <= a.length - 1 && j <= a.length - 1) {
			if (a[i] < a[j]) {
				a[i + 1] = a[j];
				j++;
				i++;
			} else {
				j++;
				result--;
			}
		}
		return result;
	}

	//Given a sorted array, remove the duplicates in place such that each element can appear atmost twice and return the new length.


	public int removeTwiceDuplicates(ArrayList<Integer> a) {

		int i = 0, j = 1;
		if (a == null || a.size() == 0)
			return 0;
		if (a.size() == 1)
			return 1;
		while (i < j && i <= a.size() - 1 && j <= a.size() - 1) {
			if (a.get(i) < a.get(j)) {
				a.set(i + 1, a.get(j));
				i++;
				j++;
			} else if (a.get(i).equals(a.get(j))) {
				a.set(i + 1, a.get(j));
				i++;

				while (i <= a.size() - 1 && j <= a.size() - 1 && a.get(i).equals(a.get(j))) {
					j++;
				}
			}
		}
		a.subList(i, a.size() - 1).clear();
		return a.size();
	}
}
