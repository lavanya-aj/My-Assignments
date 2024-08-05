package assignments;

import java.awt.Image;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/button.xhtml");
		//clicking click and check title button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']/span[text()='Click']")).click();
		//WebElement title = driver.findElement(By.xpath("//div[@class='layout-wrapper layout-wrapper-slim-sidebar slim']"));
	String actualtitle=driver.getTitle();
	if(actualtitle.contains("Dashboard")) {

	
		System.out.println("Yes the Title match the ExpectedTittle   " +actualtitle);
	}
		else {
			System.out.println("title not match");
		}
	Thread.sleep(2000);
	//navigate back to the page
	driver.navigate().back();
	WebElement verify = driver.findElement(By.xpath("//button[@type='button']/following::span[text()='Disabled'][1]"));
	if(verify.isEnabled()) {
		System.out.println("the button is not disabled");
	}
		else
		{
			System.out.println("the button is disabled");
		}
	
	
	
WebElement ele=	driver.findElement(By.xpath("//button[@type='button']/following::span[text()='Submit'][1]"));
ele.getLocation();
System.out.println(ele);
Thread.sleep(2000);
 WebElement but = driver.findElement(By.xpath("//button[@type='button']/span[text()='Save']"));
String s = but.getCssValue("background-color");
System.out.println("color"+s);
WebElement but2 = driver.findElement(By.xpath("//button[@type='button']/following::span[text()='Submit'][2]"));
Dimension b = but2.getSize();
	System.out.println("size:" +b);
	WebElement but3  =	driver.findElement(By.xpath("//button[@type='button']/span[text()='Success']"));
	 String s2 = but3.getCssValue("background-color");
	
	Thread.sleep(2000);
	
	String s3 = but3.getCssValue("background-color");
	if(s2==s3) {
		System.out.println("NO the colour is not changed ");
		
	}
	else
		System.out.println(" yes the colour changed");
	WebElement but4  =	driver.findElement(By.xpath("//button[@type='button']/span[text()='Image']"));
	
	but4.click();
	
		
	int but5 = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']//following::button")).size();

	System.out.println("There are "+but5 +" button are there");
	
	}
	
}

