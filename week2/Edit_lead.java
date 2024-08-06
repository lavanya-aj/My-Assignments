package asignment.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Edit_lead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TeastLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Lavanya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("lavanya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ajay");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Teasting");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test lead in testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("reachlavan@gmail.com");
	WebElement sel = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
	Select state = new Select(sel);
	state.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Editing the create lead");
	
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	Thread.sleep(2000);
	
	String title = driver.getTitle();
	System.out.println("Title of the page="+title );
	
	driver.close();
		

	}

}
