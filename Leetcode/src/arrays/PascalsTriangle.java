package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public List<List<Integer>> generate(int numRows) {

		List<Integer> row = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		if (numRows < 1)
			return null;

		row.add(1);
		result.add(row);
		// num == 1
		if (numRows == 1) {
			return result;
		}
		// num ==2
		row = new ArrayList<>();
		row.add(1);
		row.add(1);
		result.add(row);
		if (numRows == 2) {
			return result;

		}
		// num > 2

		List<Integer> prev = new ArrayList<>();
		while (result.size() < numRows) {
			row = new ArrayList<>();
			prev = result.get(result.size() - 1);
			row.add(1);
			for (int i = 0; i < prev.size() - 1; i++) {
				int j = i+1;
				row.add(prev.get(i) + prev.get(j));
			}
			row.add(1);
			result.add(row);
		}

		return result;
	}

}
