package day1assignment;

public class isprimeno {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		for(int j=1;j<=n;j++) {
		System.out.println(+j);
		
int c=0;

for (int i = 1; i <= j; i++) {
	if (j%i == 0) {
		c++;
	}
}
	
if (c==2) {
	
	System.out.println( +j+ " is a Prime Number");
} else {
	
System.out.println( +j+  " is Not a Prime Number");
}	
}
}
}