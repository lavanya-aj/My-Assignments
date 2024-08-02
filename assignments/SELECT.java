package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SELECT {

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
		driver.findElement(By.id("accountName")).sendKeys("AJAYl");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement dd = driver.findElement(By.name("industryEnumId"));
		Select op = new Select(dd);
		op.selectByIndex(3);
		WebElement oi = driver.findElement(By.name("ownershipEnumId"));
		Select op2= new Select(oi);
		op2.selectByVisibleText("S-Corporation");
		WebElement sc =driver.findElement(By.id("dataSourceId"));
		Select op3 =new Select(sc);
		op3.selectByValue("LEAD_EMPLOYEE");
		WebElement it = driver.findElement(By.id("marketingCampaignId"));
		Select op4 = new Select(it);
		op4.selectByIndex(6);
		WebElement sp = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select op5 = new Select(sp);
		op5.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(50000);
		driver.close();
		
	
		
				
		

	}

}
