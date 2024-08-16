package assignment.week3.string;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text ="We learn Java basics as part of java sessions in java week1";
int count=0;
String[] split = text.split(" ");

for (int i = 0; i < split.length; i++) {
	
	count=1;
	for(int j=i+1;j<split.length;j++)
	{
		if(split[i].equalsIgnoreCase(split[j]))
		{
			count++;
			split[j]= " ";
			
		}
	}
	if(split[i]!= " " && count>1)
	{
		System.out.print(split[i]+" ");
	}
	else {
		System.out.print(split[i]+" ");
	}
}



	}

}
