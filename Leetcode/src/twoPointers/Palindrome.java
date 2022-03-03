package twoPointers;

public class Palindrome {
	
	public boolean isPalindrome(String str) {
		int i =0;
		int j = str.length() -1;
		while (i < j) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
			
		}
		return true;
	}
	
	
	public boolean ifExists(int a[]) {
		int j = a.length -1;
		for(int i=0; i<a.length -1 ; i++) {
			for(; j>i; j--) {
				if(i!=j && a[i] + a[j] == 0) return true;
			    if(a[i] + a[j] < 0) break;
			}
		}
		return false;
	}

}
