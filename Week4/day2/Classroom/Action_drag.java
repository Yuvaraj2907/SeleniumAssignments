package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_drag {

	public static void main(String[] args) throws InterruptedException {

		//To Add driver to the Code
		WebDriverManager.chromedriver().setup();
		
		//Open the browser
		ChromeDriver driver=new ChromeDriver();
		
		//To get URL
		driver.get("https://jqueryui.com/draggable/");
		
		//To Maximize the Browser
		driver.manage().window().maximize();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Frame
		driver.switchTo().frame(0);	
		//Action Class for Drag
		Actions builder=new Actions(driver);
		WebElement Element=driver.findElement(By.id("draggable"));
		builder.dragAndDropBy(Element, 100, 80).perform();
	}

}
