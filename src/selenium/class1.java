package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
 WebElement element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 element.sendKeys("iphone 11");
 element.submit();
 driver.findElement(By.xpath("//span[text()='iPhone 13 (128GB) - Pink']")).click();
 
		 
	}

}