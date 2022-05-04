package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAutomation {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@data-action-type='SELECT_LOCATION']")).click();
		
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Ship outside the US'][@class='a-dropdown-prompt']")));
		
		driver.findElement(By.xpath("//*[text()='Ship outside the US'][@class='a-dropdown-prompt']")).click();
		
		driver.findElement(By.xpath("//a[text()='India']")).click();
		
	}

}
