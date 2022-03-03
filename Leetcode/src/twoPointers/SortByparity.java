package twoPointers;

import java.util.ArrayList;

public class SortByparity {

	//my Approach
	public void sortColors(ArrayList<Integer> a) {
		int i=0, j=0;
		while(i<= a.size()-1 && j<= a.size()-1) {
			int temp =0;
			if(a.get(j).equals(0)) {
				temp = a.get(i);
				
				a.set(i,a.get(j));
				a.set(j, temp);
				i++; j++;
			} else j++;
		}
		System.out.println(a);
        j=i;
		while(i<= a.size()-1 && j<= a.size()-1) {
			int temp =0;
			if(a.get(j).equals(1)) {
				temp = a.get(i);
				
				a.set(i,a.get(j));
				a.set(j, temp);
				i++; j++;
			} else j++;
		}
		
		System.out.println(a);
        j=i;
		while(i<= a.size()-1 && j<= a.size()-1) {
			int temp =0;
			if(a.get(j).equals(2)) {
				temp = a.get(i);
				
				a.set(i,a.get(j));
				a.set(j, temp);
				i++; j++;
			} else j++;
		}
		System.out.println(a);
		
    }
	
	//interviewbit approach
	public void sortColors2(ArrayList<Integer> a) {
		int i=0, j=0;
		int red =0, white=0, blue=0;
		while(i<=a.size()-1) {
			switch(a.get(i)) {
			case 0:
				red++;
				break;
			case 1:
				white++;
				break;	
			default:
				blue++;
				break;
			}
			i++;
		}
		System.out.println(a);
		while(j<red) {
			a.set(j, 0); j++;
		}
		while(j<white) {
			a.set(j, 1); j++;
		}
		while(j<blue) {
			a.set(j, 2); j++;
		}
		System.out.println(a);
	}
}
