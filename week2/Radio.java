package asignment.week2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/radio.xhtml");
		//selecting firefox in most favorite browser
		driver.findElement(By.xpath("//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']/following::label[text()='Firefox']")).click();
		//select chennai in unselectable 
		WebElement uncheck = driver.findElement(By.xpath("//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']/following::label[text()='Chennai']"));
	
		uncheck.click();
		boolean  unsel = uncheck.isEnabled();
		assertEquals(unsel,true);
		//making unselect 
		uncheck.click();
		Thread.sleep(3000);
	//selecting firefox 
   driver.findElement(By.xpath("//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']/following::label[text()='Firefox'][2]")).click();
   Thread.sleep(2000);
   //finding age 20-40 years enabled
WebElement check = driver.findElement(By.xpath("//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']/following::label[text()='21-40 Years']"));
boolean sel = check.isEnabled();
 System.out.println(sel);
 //if false then select age20-40
 if(sel==false){
	 check.click();
	 System.out.println();
	 
 }
 else
	 
	System.out.println("button already selected");
 Thread.sleep(2000);
 driver.close();
{
	
}
	}
	

}
