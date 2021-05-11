package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayListSorting {

	public static void main(String[] args) {

		List<Mobile> arrayList = new ArrayList<Mobile>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input value");
		int input = scan.nextInt();
		scan.nextLine();

		for (int i = 0; i < input; i++) {
			Mobile mob = new Mobile();
			System.out.println("Enter name :");
			String mobName = scan.nextLine();
			mob.setName(mobName);
			System.out.println("Enter price :");
			int mobPrice = scan.nextInt();
			mob.setPrice(mobPrice);
			scan.nextLine();

			if (!arrayList.contains(mob)) {
				arrayList.add(mob);
			} 
		}
		
		//System.out.println("ArrayList after distinct :: " + arrayList);

		List<Mobile> sortedList = arrayList.stream()
		        .sorted()
		        .collect(Collectors.toList());
		
		
		//(Collections.reverseOrder())
		System.out.println("arrayList" + sortedList);
	}
}
