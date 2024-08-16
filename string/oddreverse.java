package assignment.week3.string;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;

public class oddreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="I am a software tester";
	int count=0;
		String[] split = text.split("");
	

			
			for (int i = 0; i<=text.length(); i++) {
				
					String string = split[i];
					if(i%2==0) {
					
					for (int j = i; j < string.length(); j++) {
						
					
						
					{
					 
						
					for(int k=string.length()-1;k>=0;k--) {
						
				
						
						string.charAt(k);
						
					}}
					System.out.print(string);
					}
				else
					{		
				System.out.print(string);
					}
					}
					}}
	

}