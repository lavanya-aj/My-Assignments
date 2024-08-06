package asignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;






public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
 driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/following-sibling::span[1]")).click();
driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/following-sibling::span")).click();
driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/following::label[text()='Java']")).click();
driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']/preceding::div[@id='j_idt87:ajaxTriState']")).click();
driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
boolean dis = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isDisplayed();
System.out.println("DISABLED = " +dis);
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@class='ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all']")).sendKeys("London");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@aria-label='Select All']/following::div")).click();
Thread.sleep(2000);
driver.close();
 // WebElement ele =  driver.findElement(By.xpath("(//div[contains(@class,'ui-selectcheckboxmenu-panel ui-widget ui-widget-content ui-corner-all ui-helper-hidden ui-input-overlay')]//ul/li/div[@class='ui-chkbox ui-widget'])"));;
//Select element = new Select(ele);
//element.selectByVisibleText("London");


	}

}
