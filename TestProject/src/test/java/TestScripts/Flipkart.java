package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

//	public static void main(String[] args) {
//		
////		WebDriverManager.edgedriver().setup();
////		
////		WebDriver driver=new EdgeDriver();
////		
////		driver.get("https://www.flipkart.com/");
////		
////		driver.manage().window().maximize();
////		
//////		driver.findElement(By.xpath("//*[text()='Login']")).click();
////		
////		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("anuranb837@gmail.com");
////		
////		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("SomeRandomPassword");
////		
////		driver.findElement(By.xpath("(//span[text()='Login']/..)[2]")).click();
//		
//		
//		System.out.println("Flipkart program");
//	}
	
	@org.testng.annotations.Test
	public void printFlipkart() {
		System.out.println("Just print flipkart");
		
		WebDriverManager.edgedriver().setup();
		
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	driver.findElement(By.xpath("//*[text()='Login']")).click();
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("anuranb837@gmail.com");
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("SomeRandomPassword");
	
	driver.findElement(By.xpath("(//span[text()='Login']/..)[2]")).click();
	
	driver.quit();
	}

}
