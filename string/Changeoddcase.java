package assignment.week3.string;

public class Changeoddcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "“changeme";
		char[] cho = text.toCharArray();
		System.out.println("changed odd character to uppercase:");
		
		for (int i = 0; i < cho.length; i++) {
			if(i%2!=0) {

		char c = text.toUpperCase().charAt(i);

	System.out.print(c);
			}
	else {
		
	
			
			char d =text.toLowerCase().charAt(i);
				
	
			System.out.print(d);
			
	}
			
		
		}
	}

	
}

