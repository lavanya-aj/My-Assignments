package assignment.week3.list;

import java.util.ArrayList;
import java.util.List;

public class secondlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3, 2, 11, 4, 6, 7};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
			
			
		}
		list.sort(null);
		int size = list.size();
		System.out.println(list);
		//System.out.println(size);
		Integer sl = list.get(size-2);
		System.out.println("Second largeset number is " +sl);

	}

}
