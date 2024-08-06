package asignment.week2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead {

	public static void main(String[] args) {
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
		driver.findElement(By.partialLinkText("Find")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header x-panel-header-noborder x-unselectable']/following::li[2]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		
		driver.findElement(By.xpath("//input[@name='phoneNumber']/following::td[@class='x-panel-btn-td']")).click();
		//driver.findElement(By.xpath("//input[@name='phoneNumber']/following::div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
 WebElement ele= driver.findElement(By.xpath("//td/div/a[@class='linktext'][text()='13158']"));
 
String first=ele.getText();
System.out.println(first);
ele.click();

		driver.findElement(By.xpath("//a[text()='Delete']")).click();
	
			
	

	}

}
