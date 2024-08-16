package assignment.week3.inheritance;

public class LoginTestData extends Testdata  {
	public void enterUsername() {
		System.out.println("EnterUsername");
		
	}
	public void enterPassword()
 {
		System.out.println("EnterPassword");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData tld = new LoginTestData();
		
		tld.enterUsername();
		tld.enterPassword();
		tld.enterCredentials();
		tld.navigateToHomePage();
	}

}
