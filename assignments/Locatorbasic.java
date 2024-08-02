package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorbasic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();

driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
//driver.findElement(By.className("x-panel-header-text")).click();
driver.findElement(By.partialLinkText("Create")).click();
driver.findElement(By.id("accountName")).sendKeys("AJAY");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("numberEmployees")).sendKeys("15");
driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
System.out.println("TITLE : "+driver.getTitle());
Thread.sleep(5000);
driver.close();
	}

}
