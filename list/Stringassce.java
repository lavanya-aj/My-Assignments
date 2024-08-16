package assignment.week3.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stringassce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String[] list = {"HCL","Wipro","AspireSystems","CTS"};
	
	
		List<String> company= new ArrayList<String>();
	Collections.addAll(company, list);
	Collections.reverse(company);
	System.out.print("Reveersed list= "+company);
	
		
		
		
	}
		

	}


