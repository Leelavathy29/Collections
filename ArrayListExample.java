package ArrayList;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		arrayList.add("Leela");
		arrayList.add(45);
		arrayList.add(new Date());
		
		System.out.println(arrayList);
	}
}
