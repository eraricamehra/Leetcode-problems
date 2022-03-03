package practise;

public class GameTwo {

	public int solution(String A, String B) {
		String[] begin = A.split(":");
		String[] end = B.split(":");

		int beginHour = Integer.parseInt(begin[0]);
		int endHour = Integer.parseInt(end[0]);
		int startMin = Integer.parseInt(begin[1]);
		int endMin = Integer.parseInt(end[1]);

		int roundsCount = 0;
		int hourDifference = 0;
		if (beginHour > endHour) {
			hourDifference = (24 - beginHour) + endHour;
		} else if (endHour > beginHour) {
			hourDifference = endHour - beginHour;
		} else if (startMin > endMin) {
			hourDifference = 24;
		} else {
			hourDifference = 0;
		}

		if (hourDifference >= 1) {
			roundsCount = roundsCount + (hourDifference - 1) * 4;
			if (startMin == 0) {
				roundsCount = roundsCount + 4;
			} else if (startMin <= 15) {
				roundsCount = roundsCount + 3;
			} else if (startMin <= 30) {
				roundsCount = roundsCount + 2;
			} else if (startMin <= 45) {
				roundsCount = roundsCount + 1;
			}

			if (endMin >= 45) {
				roundsCount = roundsCount + 3;
			} else if (endMin >= 30) {
				roundsCount = roundsCount + 2;
			} else if (endMin >= 15) {
				roundsCount = roundsCount + 1;
			}
		} else {
			if (startMin == 0 && endMin >= 15) {
				roundsCount = roundsCount + 1;
			}

			if (startMin <= 15 && endMin >= 30) {
				roundsCount = roundsCount + 1;
			}

			if (startMin <= 30 && endMin >= 45) {
				roundsCount = roundsCount + 1;
			}
		}

		return roundsCount;
	}

}
