package TestScripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsSelenium {

	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://demoqa.com/alertsWindows");
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
//		wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='modal micromodal-slide is-open']"), "aria-hidden", "false"));
//		
//		
//		driver.findElement(By.xpath("(//button[@class='modal__close'])[2]")).click();
//		
//		driver.findElement(By.xpath("//a[text()='Demo Site']")).click();
//		
//		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
//		
//		driver.switchTo().window(windows.get(1));
//		
//		WebElement element = driver.findElement(By.xpath("//*[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0']"));       
//	    ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element);
//		
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Alerts, Frame & Windows']")));
//		driver.findElement(By.xpath("//*[text()='Alerts, Frame & Windows']")).click();
		
		driver.findElement(By.xpath("//span[text()='Browser Windows']")).click();
		
	    driver.findElement(By.xpath("//button[text()='New Tab']")).click();
	    
	    driver.findElement(By.xpath("//button[text()='New Window']")).click();
	    
	    driver.findElement(By.xpath("//button[text()='New Window Message']")).click();
	    
	    ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
	    windows = new ArrayList<String>(driver.getWindowHandles());
	    
	    driver.switchTo().window(windows.get(0));
	    
	    driver.switchTo().window(windows.get(3));
		
	}

}
