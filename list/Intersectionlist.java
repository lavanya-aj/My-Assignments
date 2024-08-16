package assignment.week3.list;

import java.util.ArrayList;
import java.util.List;

public class Intersectionlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={3, 2, 11, 4, 6, 7};
		int[] b= {1, 2, 8, 4, 9, 7};
		
	List<Integer> list1= new ArrayList<Integer>();
	
	
	/*for (int i = 0; i < a.length; i++) {
		
		
	}
	for (int i = 0; i < b.length; i++) {
		
	list2.add(a[i]);
	}*/
	for (int i = 0; i < a.length; i++) {
		if(a[i]==b[i])
				{
		list1.add(a[i]);
			}
	}	System.out.print("the Intersection of array list =" +list1);
	}

}
