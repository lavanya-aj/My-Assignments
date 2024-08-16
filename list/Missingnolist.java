package assignment.week3.list;

import java.util.ArrayList;
import java.util.List;

public class Missingnolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 10, 6, 8};
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			 list.add(a[i]);
		}
		list.sort(null);
		System.out.println("Given numbers" +list);
		
	for (int i = 1; i < 10; i++) {
		
		if(list.contains(i)) {
			
		
		}
	else {
		list2.add(i);
		
	}
	}
		System.out.println("missing numbers"+list2);
		
		
		}
}
