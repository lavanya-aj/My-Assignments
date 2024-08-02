package day2assignment;

public class Findmissingnumber {
	public void missingnumber() {
	int a[]= {1,4,3,2,8,6,7};
	int m;
	int sum1=0;
	for (int i = 0; i < a.length; i++) {
	
		
	
	sum1=sum1+a[i];
	
	}int sum2=0;
		for (int i = 0; i < 9; i++) {
			sum2=sum2+i;
			
		}
		m=sum2-sum1;
		System.out.println("missing number  " +m);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Findmissingnumber fm = new Findmissingnumber();
		
		fm.missingnumber();
		

	}

}
