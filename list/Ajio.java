package assignment.week3.list;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div/label[@for='Men']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div/label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
	List<WebElement> bagpr = driver.findElements(By.xpath("//span[@class='price  ']"));
	System.out.println("the pricesbag");
	for (int i = 0; i < bagpr.size(); i++) {
		
	
	String text = bagpr.get(i).getText();
	System.out.println(i+1 + " bag price=  " +text);
	
	}
	List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
	List<WebElement> name = driver.findElements(By.xpath("//div[@class='nameCls']"));
	System.out.println(" size of bags   "+brands.size());
	System.out.println("Brand of bags");
	for (int i = 0; i <brands.size(); i++) {
		String text1 = brands.get(i).getText();
		System.out.println(i+1+ "brand  : "+text1);
		
	}System.out.println("The name of the bags");
	for (int i = 0; i <brands.size(); i++) {
		String text2 = name.get(i).getText();
		System.out.println(i+1+ "name : "+text2);
		
	}
	}
	

	}


