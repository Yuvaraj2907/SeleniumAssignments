package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSelectable {

	public static void main(String[] args) {

		//To Add driver to the Code
				WebDriverManager.chromedriver().setup();
						
				//Open the browser
				ChromeDriver driver=new ChromeDriver();
						
				//To get URL
				driver.get("https://jqueryui.com/selectable/");
				
				//To Maximize the Browser
				driver.manage().window().maximize();
				
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Frame
				driver.switchTo().frame(0);	
				//Action Class for Selectable
				Actions builder=new Actions(driver);
				WebElement item1= driver.findElement(By.xpath("//li[text()='Item 1']"));
				WebElement item3= driver.findElement(By.xpath("//li[text()='Item 3']"));
				WebElement item5 =driver.findElement(By.xpath("//li[text()='Item 5']"));
				WebElement item7= driver.findElement(By.xpath("//li[text()='Item 7']"));
				//action performing Control keys down, clicking 1,3,5,7 and Keyup Ctrl and perform
				//builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).keyUp(Keys.CONTROL).perform();
				builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).perform();		
				}

}
