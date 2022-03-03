package practise;

import java.util.List;

public class ShowList {
	
	public <E>  void showList(List<E> list) {
		for(E n: list) {
			System.out.println(n+ " , ");
		}
		System.out.println();
	}

}
