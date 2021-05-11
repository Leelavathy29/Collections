package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add("leela");
		list.add(45);
		list.add("Abi");
		list.add(24);
		list.add("Uma");
		list.add(48);
		
		System.out.println(list);
		
		for(Object l : list) {
			System.out.println(l);
		}
		
		
		//Iterator
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
	
}
