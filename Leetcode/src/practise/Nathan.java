package practise;

public class Nathan {
	
	//test1a, test1b,
	public int getTestScore (String[] T, String[] R) {
		int groupsPassed = 0;
		int totalGroups=0;
		int j = 0;
		boolean passed= true;
		
		for (int i = 0; i <= T.length-1 ; i=j) {
			String name = T[i];
			System.out.println(name);
			j = i + 1; 
			String nextTestCase = (i == T.length-1)? T[i]: T[j];
			if (Character.isDigit(name.charAt(name.length() - 1))) {
				totalGroups++;
				
			} else if (!Character.isDigit(name.charAt(name.length() - 1))) {
				
				// char lastChar = name.charAt(name.length() -1);
				char lastSecondCharCurrent = name.charAt(name.length() - 2); // at i
				char lastSecondCharPrev = nextTestCase.charAt(name.length() - 2); // at j
				while (lastSecondCharCurrent == lastSecondCharPrev) {
					j++;
					nextTestCase = T[j];
					// lastSecondCharCurrent = name.charAt(name.length() -2); // at i
					lastSecondCharPrev = nextTestCase.charAt(name.length() - 2);
				}
				totalGroups++;
			}

		}
		System.out.println("Total" + totalGroups);
		
		for(int i=0; i< T.length; i++) {
			String name = T[i];
			
			if(Character.isDigit(name.charAt(name.length() -1)))  {
				if(R[i] == "OK") {
					groupsPassed++;
				}
			} else if(!Character.isDigit(name.charAt(name.length() - 1)))  {
			    j= i+1;
				String nextTestCase = T[j];
				//char lastChar = name.charAt(name.length() -1);
				char lastSecondCharCurrent = name.charAt(name.length() -2); // at i
				char lastSecondCharPrev = nextTestCase.charAt(name.length() -2); //at j
//				while(lastSecondCharCurrent != lastSecondCharPrev) {
//					groupsPassed++;
//				}
				
				while (lastSecondCharCurrent == lastSecondCharPrev)  {
					j++;
					nextTestCase = T[j];
					// lastSecondCharCurrent = name.charAt(name.length() -2); // at i
					lastSecondCharPrev = nextTestCase.charAt(name.length() - 2);
					if (R[i] != "OK" && R[j] != "OK"){ 
						passed = false;
					}
				}
				if(passed) groupsPassed++;
				
			}
				
		}
		System.out.println("Groups passed" + groupsPassed);

		return  calculateScore(totalGroups, groupsPassed);
		
	}
	
	public int calculateScore(int totalGroups, int groupsPassed) {
		 int score = (groupsPassed * 100)/totalGroups;
		 //TODO round up 
		 return score;
	}

}
