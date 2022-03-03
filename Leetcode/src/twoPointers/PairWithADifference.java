package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PairWithADifference {

	public int solve(ArrayList<Integer> A, int B) {

		//fastest is with hashset. Try again with hashset
		// sort
		if(A.size() <= 1) return 0;
        Collections.sort(A);
		int i = 0, j = 1;
		while (i <= A.size() - 1 && j <= A.size() - 1) {

			if ((A.get(j) - A.get(i)) < B)
				j++;
			else if ((A.get(j) - A.get(i)) > B)
				i++;
			else if ((A.get(j) - A.get(i)) == B && i==j) j++;
			else if ((A.get(j) - A.get(i)) == B && i!=j)
				return 1;
		}
		return 0;

	}
}
