package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;






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
WebElement element = driver.findElement(By.xpath("//h5[text()='Select Multiple']"));
Select bu = new Select(element);
bu.selectByIndex(2);


	}

}
