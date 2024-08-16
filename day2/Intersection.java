package assignment.week3.day2;

import java.util.HashSet;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] list1= {3, 2, 11, 4, 6, 7};
	int[] list2= {1, 2, 8, 4, 9, 7};

HashSet<Integer>set1=new HashSet<>();





for (Integer val : list1) {
	set1.add(val);
	
}
	for (Integer val : list2) {
		if(set1.contains(val)) {
			set1.add(val);
		System.out.print(val+",");
		}
			
	}
	


}
	}


