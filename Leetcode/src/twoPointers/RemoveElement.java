package twoPointers;

import java.util.ArrayList;
public class RemoveElement {
	
	
   public int removeElement2(ArrayList<Integer> a, int b) {
		
		if(a.size() == 0) return 0;
		int i=0, j=0;
		int total=0;
		while(i<=a.size() -1 && j<=a.size()-1) {
			if(!a.get(j).equals(b)) {
				a.set(i, a.get(j));
				i++; j++;
			}
			else {
				j++; total ++;
			}
		}
		System.out.println(a);
		System.out.println(total);
		a.subList(a.size() - total, a.size()).clear();
		System.out.println(a);

		return a.size();
    }
   
   public int removeElement(ArrayList<Integer> a, int b)
	{
	    int n = a.size();
	    int i, j;
	    
	    for (i=0, j=0; j<n; j++)
	    {
	        if (a.get(j) != b)
	        {
	            a.set(i, a.get(j));
	            i++;
	        }
	    }
	    
	    return i;
	}


}
